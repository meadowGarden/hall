package pricing;

import config.Constants;
import enums.PackageSize;
import mappers.TransactionMapper;
import model.PricedTransaction;
import model.PricingRequest;
import model.Transaction;
import pricing.strategies.DiscountStrategy;
import shipment.ShipmentSupplier;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/*
an object where raw data is mapped to concrete objects, core business logic orchestrator (ShipmentCalculatorContext)
is initiated and where final result is printed to console

the main idea behind design is strategy design/ dependency injection patterns
this decouples code for easy modification or addition of pricing rules
 */

public final class ShipmentCalculator {
    private final List<DiscountStrategy> discountStrategyList;
    private final PricingRequest request;
    private final List<Transaction> transactions;

    public ShipmentCalculator(final PricingRequest request, final DiscountStrategy... strategies) {
        this.request = request;
        this.transactions = new ArrayList<>();
        this.discountStrategyList = new ArrayList<>(List.of(strategies));
    }

    /*
    discount strategies are transformed to list, and the logic inside every strategy is executed
    ShipmentCalculatorContext evaluates that logic of the strategy would not violate logical integrity of the transaction
    and of other strategies:
      - discount must not be bigger than price,
      - discount must not be bigger that discount pool,
      - total sum of discounts must not be bigger than discount pool
    context acts in the very end, and only then transaction state is changed
     */
    public List<PricedTransaction> calculateShipment() {
        mapTransactions(this.request);
        final ShipmentCalculatorContext context = new ShipmentCalculatorContext(request.getCountryProfile());
        context.setMonthDiscountCap(Constants.DISCOUNT_LIMIT_10);

        final List<PricedTransaction> pricedTransactions = new ArrayList<>();

        for (Transaction transaction : transactions) {
            try {
                context.evaluateMonth(transaction.getDate().getMonthValue());

                double basePrice = getTransactionsBasePrice(transaction);
                final PricedTransaction pricedTransaction = new PricedTransaction(transaction, basePrice);
                context.setPricedTransaction(pricedTransaction);

                for (DiscountStrategy strategy : discountStrategyList)
                    strategy.apply(context);

                context.applyFeasibleDiscountToTransaction();
                context.resetFeasibleDiscount();
                pricedTransactions.add(pricedTransaction);
            } catch (UnsupportedOperationException e) {
                System.err.println(e.getMessage());
            }
        }

        printPriceTransactions(pricedTransactions);
        return pricedTransactions;
    }

    private void printPriceTransactions(final List<PricedTransaction> pricedTransactions) {
        for (PricedTransaction pricedTransaction : pricedTransactions)
            System.out.println(pricedTransaction);
    }

    /*
    since there are countless reasons for string to cause an exception, whole mapping operation is in try/ catch clause
    without trying to pinpoint the cause
    exception handler creates dummy transaction, last constructor argument flags transaction as not serviceable, and
    this attribute is later the first one to be tested before doing operations with a transaction/ priced transaction
     */
    private void mapTransactions(PricingRequest request) {
        for (String s : request.getTransactions()) {
            try {
                Transaction transaction = TransactionMapper.transactionFromString(s);
                transactions.add(transaction);
            } catch (Exception e) {
                Transaction transaction = insertInvalidTransaction();
                transaction.setNonServiceableString(s);
                transactions.add(transaction);
            }
        }
    }

    private Transaction insertInvalidTransaction() {
        return new Transaction(ZonedDateTime.now(), PackageSize.LARGE, "-", false);
    }

    private double getTransactionsBasePrice(final Transaction transaction) {
        for (ShipmentSupplier supplier : this.request.getCountryProfile().getShipmentSuppliers())
            if (supplier.getAbbreviation().equals(transaction.getSupplierAbbreviation()))
                return supplier.getPriceList().get(transaction.getSize());

        return 0.0;
    }
}
