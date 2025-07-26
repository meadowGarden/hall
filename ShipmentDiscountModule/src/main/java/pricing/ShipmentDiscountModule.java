package pricing;

import model.PricedTransaction;
import model.PricingRequest;
import pricing.strategies.MonthlyDiscountCapStrategy;
import pricing.strategies.SmallShipmentLowestPriceStrategy;
import pricing.strategies.ThirdLargeLPFreeStrategy;

import java.util.ArrayList;
import java.util.List;

/*
an object dedicated to take request, containing list of transactions and country profile, and
evaluating its price, based on given conditions

planned for multiple requests from the very beginning
 */
public final class ShipmentDiscountModule {
    public static List<PricedTransaction> run(final PricingRequest... requests) {

        final var smallShipmentLowestPrice = new SmallShipmentLowestPriceStrategy();
        final var thirdLargeLPFree = new ThirdLargeLPFreeStrategy();
        final var monthlyDiscountCap = new MonthlyDiscountCapStrategy();

        final List<PricedTransaction> resultsForAllRequests = new ArrayList<>();

        for (PricingRequest request : requests) {

            final ShipmentCalculator calculator = new ShipmentCalculator(
                    request,
                    smallShipmentLowestPrice,
                    thirdLargeLPFree,
                    monthlyDiscountCap);

            resultsForAllRequests.addAll(calculator.calculateShipment());
        }

        return resultsForAllRequests;
    }
}
