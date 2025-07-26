package pricing.strategies;

import pricing.ShipmentCalculatorContext;

public final class MonthlyDiscountCapStrategy implements DiscountStrategy {
    @Override
    public void apply(final ShipmentCalculatorContext context) {
        double feasibleDiscount = context.getFeasibleDiscount();
        double price = context.getPricedTransaction().getPrice();

        if (Double.compare(feasibleDiscount, 0) == 0)
            return;

        double discountPool = context.getDiscountPool();

        if (price < feasibleDiscount)
            feasibleDiscount = price;

        if (discountPool > feasibleDiscount) {
            context.setDiscountPool(discountPool - feasibleDiscount);
            return;
        }

        context.setFeasibleDiscount(discountPool);
        context.setDiscountPool(0);
    }
}
