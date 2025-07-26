package pricing;

import model.PricedTransaction;
import shipment.CountryProfile;

/*
the main state organizer of the module
its responsibilities are:
 - collect changes, made by discount strategies
 - keep track of transaction data
 - evaluate how changes made by discount strategy compares with transaction data
 - act on previously mentioned evaluations with method applyFeasibleDiscountToTransaction()

discountPool and feasibleDiscount are fields working closely together
feasibleDiscount is the discount that may be available for current transaction, but not necessarily completely viable
field discountPool will reference feasibleDiscount because feasibleDiscount can never be bigger than discountPool
for the same reason discount can not be bigger than price of the transaction itself
 */
public class ShipmentCalculatorContext {
    private final CountryProfile countryProfile;
    private PricedTransaction pricedTransaction;

    private double monthDiscountCap;
    private double discountPool;
    private int currentMonth;

    private double feasibleDiscount;
    private int largeShipmentLPCount;
    private boolean isLargeShipmentLPFree;

    public ShipmentCalculatorContext(final CountryProfile countryProfile) {
        if (countryProfile == null)
            throw new UnsupportedOperationException("Country profile cannot be null");

        this.countryProfile = countryProfile;
        this.isLargeShipmentLPFree = true;
    }

    public void applyFeasibleDiscountToTransaction() {
        final double transactionPrice = this.getPricedTransaction().getPrice();
        final double feasibleDiscount = this.getFeasibleDiscount();

        if (transactionPrice < feasibleDiscount) {
            this.pricedTransaction.setPrice(0);
            this.pricedTransaction.setDiscount(transactionPrice);
            return;
        }

        this.pricedTransaction.setPrice(transactionPrice - feasibleDiscount);
        this.pricedTransaction.setDiscount(feasibleDiscount);
    }

    public void resetFeasibleDiscount() {
        this.feasibleDiscount = 0;
    }

    public CountryProfile getCountryProfile() {
        return this.countryProfile;
    }

    public PricedTransaction getPricedTransaction() {
        return pricedTransaction;
    }

    public void setPricedTransaction(final PricedTransaction pricedTransaction) {
        if (pricedTransaction == null)
            throw new UnsupportedOperationException("Priced transaction cannot be null");

        this.pricedTransaction = pricedTransaction;
    }

    public void setMonthDiscountCap(final double monthDiscountCap) {
        if (monthDiscountCap < 0)
            throw new UnsupportedOperationException("Month discount cap cannot be negative number");

        this.monthDiscountCap = monthDiscountCap;
    }

    public double getMonthDiscountCap() {
        return this.monthDiscountCap;
    }

    public double getDiscountPool() {
        return this.discountPool;
    }

    public void setDiscountPool(final double discountPool) {
        if (discountPool < 0)
            throw new UnsupportedOperationException("Discount pool cannot be negative number");

        this.discountPool = discountPool;
    }

    public void evaluateMonth(final int month) {
        if (month < 0)
            throw new UnsupportedOperationException("Month cannot be negative number");
        else if (month > 12)
            throw new UnsupportedOperationException("Month value cannot be above 12");

        if (this.currentMonth != month) {
            this.currentMonth = month;
            this.discountPool = this.monthDiscountCap;
            this.largeShipmentLPCount = 0;
            this.isLargeShipmentLPFree = true;
        }
    }

    public int getLargeShipmentLPCount() {
        return this.largeShipmentLPCount;
    }

    public void setLargeShipmentLPCount(final int count) {
        if (count < 0)
            throw new UnsupportedOperationException("Shipment count cannot be negative number");

        this.largeShipmentLPCount = count;
    }

    public void increaseLargeShipmentLPCount() {
        this.largeShipmentLPCount++;
    }

    public boolean isLargeShipmentLPFree() {
        return isLargeShipmentLPFree;
    }

    public void setIsLargeShipmentFree(final boolean largeShipmentFree) {
        this.isLargeShipmentLPFree = largeShipmentFree;
    }

    public double getFeasibleDiscount() {
        return this.feasibleDiscount;
    }

    public void setFeasibleDiscount(final double discount) {
        if (discount < 0)
            throw new UnsupportedOperationException("Discount cannot be negative number");

        this.feasibleDiscount = discount;
    }
}
