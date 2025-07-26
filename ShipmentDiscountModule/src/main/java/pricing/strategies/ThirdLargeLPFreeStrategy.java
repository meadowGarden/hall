package pricing.strategies;

import config.Constants;
import enums.PackageSize;
import model.PricedTransaction;
import pricing.ShipmentCalculatorContext;

public final class ThirdLargeLPFreeStrategy implements DiscountStrategy {
    @Override
    public void apply(ShipmentCalculatorContext context) {
        final PricedTransaction pricedTransaction = context.getPricedTransaction();
        final PackageSize packageSize = pricedTransaction.getTransaction().getSize();
        final String shipmentSupplierAbbreviation = pricedTransaction.getTransaction().getSupplierAbbreviation();

        if (!packageSize.equals(PackageSize.LARGE) || !shipmentSupplierAbbreviation.equals(Constants.SUPPLIER_LP))
            return;

        final double currentPrice = pricedTransaction.getPrice();
        if (context.isLargeShipmentLPFree() && context.getLargeShipmentLPCount() == 2) {
            context.setFeasibleDiscount(context.getFeasibleDiscount() + currentPrice);
            context.setIsLargeShipmentFree(false);
        }

        if (context.isLargeShipmentLPFree())
            context.increaseLargeShipmentLPCount();
    }
}
