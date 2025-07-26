package pricing;

import enums.Country;
import enums.PackageSize;
import model.PricedTransaction;
import model.PricingRequest;
import org.junit.jupiter.api.*;
import shipment.CountryProfile;
import shipment.ShipmentSupplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("shipment discount module")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ShipmentDiscountModuleTest {
    PricingRequest request;
    static String expectedSTDOUT;

    @BeforeAll
    static void setUpBeforeAll() {
        expectedSTDOUT = "2015-02-01 S MR 1.50 0.50\n" +
                "2015-02-02 S MR 1.50 0.50\n" +
                "2015-02-03 L LP 6.90 -\n" +
                "2015-02-05 S LP 1.50 -\n" +
                "2015-02-06 S MR 1.50 0.50\n" +
                "2015-02-06 L LP 6.90 -\n" +
                "2015-02-07 L MR 4.00 -\n" +
                "2015-02-08 M MR 3.00 -\n" +
                "2015-02-09 L LP 0.00 6.90\n" +
                "2015-02-10 L LP 6.90 -\n" +
                "2015-02-10 S MR 1.50 0.50\n" +
                "2015-02-10 S MR 1.50 0.50\n" +
                "2015-02-11 L LP 6.90 -\n" +
                "2015-02-12 M MR 3.00 -\n" +
                "2015-02-13 M LP 4.90 -\n" +
                "2015-02-15 S MR 1.50 0.50\n" +
                "2015-02-17 L LP 6.90 -\n" +
                "2015-02-17 S MR 1.90 0.10\n" +
                "2015-02-24 L LP 6.90 -\n" +
                "2015-02-29 CUSPS Ignored\n" +
                "2015-03-01 S MR 1.50 0.50";
    }

    @BeforeEach
    void setUpBeforeEach() {
        List<String> transactionsCorrect = new ArrayList<>(List.of(
                "2015-02-01 S MR",
                "2015-02-02 S MR",
                "2015-02-03 L LP",
                "2015-02-05 S LP",
                "2015-02-06 S MR",
                "2015-02-06 L LP",
                "2015-02-07 L MR",
                "2015-02-08 M MR",
                "2015-02-09 L LP",
                "2015-02-10 L LP",
                "2015-02-10 S MR",
                "2015-02-10 S MR",
                "2015-02-11 L LP",
                "2015-02-12 M MR",
                "2015-02-13 M LP",
                "2015-02-15 S MR",
                "2015-02-17 L LP",
                "2015-02-17 S MR",
                "2015-02-24 L LP",
                "2015-02-29 CUSPS",
                "2015-03-01 S MR"));

        Map<PackageSize, Double> priceList0001 = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 2.0),
                Map.entry(PackageSize.MEDIUM, 3.0),
                Map.entry(PackageSize.LARGE, 4.0)
        ));
        ShipmentSupplier supplier001 = new ShipmentSupplier("Mondial Relay", "MR", priceList0001);

        Map<PackageSize, Double> priceList0002 = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 1.5),
                Map.entry(PackageSize.MEDIUM, 4.9),
                Map.entry(PackageSize.LARGE, 6.9)
        ));
        ShipmentSupplier supplier002 = new ShipmentSupplier("La Poste", "LP", priceList0002);

        CountryProfile countryProfile = new CountryProfile(Country.FRANCE);
        countryProfile.addShipmentSupplier(supplier001);
        countryProfile.addShipmentSupplier(supplier002);

        request = new PricingRequest(transactionsCorrect, countryProfile);

    }

    @Test
    @Order(1)
    @DisplayName("evaluate transactions, task data")
    void executeTransactionEvaluation_success() {
        List<PricedTransaction> result = ShipmentDiscountModule.run(request);
        StringBuilder sb = new StringBuilder();

        double totalPrices = 0;
        double totalDiscounts = 0;

        for (PricedTransaction p : result) {
            sb.append(p.toString()).append("\n");
            totalPrices += p.getPrice();
            totalDiscounts += p.getDiscount();
        }

        assertNotNull(result);
        assertEquals(21, result.size());
        assertEquals(expectedSTDOUT, sb.substring(0, sb.length() - 1).replaceAll(",", "."));
        assertEquals(0, Double.compare(70.2, totalPrices));
        assertEquals(0, Double.compare(10.5, totalDiscounts));
    }
}
