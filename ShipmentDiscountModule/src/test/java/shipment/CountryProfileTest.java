package shipment;

import enums.Country;
import enums.PackageSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("country profile")
class CountryProfileTest {
    ShipmentSupplier supplier001;
    ShipmentSupplier supplier002;
    CountryProfile country;

    @BeforeEach
    void setUpBeforeEach() {
        Map<PackageSize, Double> priceList0001 = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 2.0),
                Map.entry(PackageSize.MEDIUM, 3.0),
                Map.entry(PackageSize.LARGE, 4.0)
        ));
        supplier001 = new ShipmentSupplier("Mondial Relay", "MR", priceList0001);

        Map<PackageSize, Double> priceList0002 = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 1.5),
                Map.entry(PackageSize.MEDIUM, 4.9),
                Map.entry(PackageSize.LARGE, 6.9)
        ));
        supplier002 = new ShipmentSupplier("La Poste", "LP", priceList0002);

        country = new CountryProfile(Country.FRANCE);
        country.addShipmentSupplier(supplier001);
    }

    @Test
    @DisplayName("get shipment suppliers, operating in the given country")
    void getShipmentSuppliers() {
        assertEquals(supplier001, country.getShipmentSuppliers().get(0));
    }

    @Test
    @DisplayName("add shipment supplier")
    void addShipmentSupplier() {
        country.addShipmentSupplier(supplier002);
        int numberOfSuppliers = country.getShipmentSuppliers().size();
        assertEquals(supplier002, country.getShipmentSuppliers().get(numberOfSuppliers - 1));
    }

    @Test
    @DisplayName("remove shipment supplier from country profile")
    void removeShipmentSupplier_success() {
        Map<PackageSize, Double> priceList003 = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 1.29),
                Map.entry(PackageSize.MEDIUM, 2.95),
                Map.entry(PackageSize.LARGE, 4.49)
        ));

        ShipmentSupplier supplier003 = new ShipmentSupplier("Dev03", "03", priceList003);
        country.addShipmentSupplier(supplier003);
        int numberOfSuppliersBefore = country.getShipmentSuppliers().size();

        assertTrue(country.removeShipmentSupplier(supplier003));
        int numberOfSuppliersAfter = country.getShipmentSuppliers().size();

        assertEquals(numberOfSuppliersAfter, numberOfSuppliersBefore - 1);
    }


    @Test
    @DisplayName("do not let to remove shipment supplier that does not exists")
    void removeShipmentSupplierTwice_failure() {
        ShipmentSupplier supplier004 = new ShipmentSupplier("Dev04", "D04");
        assertFalse(country.removeShipmentSupplier(supplier004));
        assertFalse(country.removeShipmentSupplier(null));
    }

    @Test
    @DisplayName("get country from country profile")
    void getCountry() {
        country.setCountry(Country.FRANCE);
        assertSame(country.getCountry(), Country.FRANCE);
    }

    @Test
    @DisplayName("set country to country profile")
    void setCountry() {
        country.setCountry(Country.GERMANY);
        assertSame(country.getCountry(), Country.GERMANY);
    }

    @Test
    @DisplayName("do not allow to set shipment supplier twice")
    void addShipmentSupplierTwice() {
        country.addShipmentSupplier(supplier001);
        assertFalse(country.addShipmentSupplier(supplier001));
    }
}
