package pricing.strategies;

import enums.PackageSize;
import model.PricedTransaction;
import pricing.ShipmentCalculatorContext;
import shipment.ShipmentSupplier;

import java.util.List;

public final class SmallShipmentLowestPriceStrategy implements DiscountStrategy {
    @Override
    public void apply(ShipmentCalculatorContext context) {
        final PricedTransaction pricedTransaction = context.getPricedTransaction();

        final PackageSize packageSize = pricedTransaction.getTransaction().getSize();
        if (packageSize == PackageSize.SMALL) {
            double lowestPrice = extractLowestPrice(context);
            context.setFeasibleDiscount(pricedTransaction.getPrice() - lowestPrice);
        }
    }

    private double extractLowestPrice(final ShipmentCalculatorContext context) {
        final List<ShipmentSupplier> suppliers = context.getCountryProfile().getShipmentSuppliers();
        double price = Double.MAX_VALUE;

        for (ShipmentSupplier s : suppliers)
            price = Math.min(price, s.getPriceList().get(PackageSize.SMALL));

        return price;
    }
}
