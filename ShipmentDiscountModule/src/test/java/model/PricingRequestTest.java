package model;

import enums.Country;
import enums.PackageSize;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shipment.CountryProfile;
import shipment.ShipmentSupplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("pricing request")
class PricingRequestTest {
    static PricingRequest request;
    static List<String> transactions;
    static CountryProfile countryProfile;

    @BeforeAll
    static void setUpBeforeEach() {
        transactions = new ArrayList<>(List.of("2015-02-06 L LP","2015-02-07 L MR","2015-02-08 M MR"));

        Map<PackageSize, Double> priceList = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 1.29),
                Map.entry(PackageSize.MEDIUM, 2.95),
                Map.entry(PackageSize.LARGE, 4.49)

        ));
        ShipmentSupplier supplier = new ShipmentSupplier("Dev001", "MR", priceList);
        supplier.setPriceList(priceList);
        countryProfile = new CountryProfile(Country.FRANCE);
        request = new PricingRequest(transactions, countryProfile);
    }

    @Test
    @DisplayName("get the transactions")
    void getTransactions_success() {
        assertIterableEquals(transactions, request.getTransactions());
    }

    @Test
    @DisplayName("get the country")
    void getCountry_success() {
        assertEquals(Country.FRANCE, request.getCountryProfile().getCountry());
    }

    @Test
    @DisplayName("failure to get the country")
    void getCountry_failure() {
        assertNotEquals(Country.GERMANY, request.getCountryProfile().getCountry());
    }
}
