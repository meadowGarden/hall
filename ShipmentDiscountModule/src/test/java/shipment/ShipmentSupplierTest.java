package shipment;

import enums.PackageSize;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("shipment supplier")
class ShipmentSupplierTest {
    static ShipmentSupplier supplier;
    static Map<PackageSize, Double> priceList;

    @BeforeAll
    static void setUpBeforeEach() {
        priceList = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 1.29),
                Map.entry(PackageSize.MEDIUM, 2.95),
                Map.entry(PackageSize.LARGE, 4.49)

        ));
        supplier = new ShipmentSupplier("Hermes Delivery", "HD", priceList);
    }

    @Test
    @DisplayName("get shipment supplier name")
    @Order(1)
    void getName() {
        assertEquals("Hermes Delivery", supplier.getName());
    }

    @Test
    @DisplayName("set shipment supplier name")
    @Order(2)
    void setName() {
        supplier.setName("Mercury Delivery");
        assertEquals("Mercury Delivery", supplier.getName());
    }

    @Test
    @DisplayName("get shipment supplier abbreviation")
    @Order(3)
    void getAbbreviation() {
        assertEquals("HD", supplier.getAbbreviation());
    }

    @Test
    @DisplayName("get shipment supplier price list")
    @Order(4)
    void getPriceList_success() {
        String message = "price list lines should match";
        supplier.setPriceList(priceList);
        assertIterableEquals(priceList.entrySet(), supplier.getPriceList().entrySet(), message);
    }

    @Test
    @DisplayName("set shipment supplier price list")
    @Order(5)
    void setPriceList() {
        Map<PackageSize, Double> anotherPriceList = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, 2.29),
                Map.entry(PackageSize.MEDIUM, 3.95),
                Map.entry(PackageSize.LARGE, 5.49)

        ));
        supplier.setPriceList(anotherPriceList);

        assertIterableEquals(
                anotherPriceList.entrySet(), supplier.getPriceList().entrySet(), "price list lines should match"
        );
    }

    @Test
    @DisplayName("compare shipment supplier with itself")
    @Order(6)
    void compareShipmentSupplierWithItself() {
        ShipmentSupplier supplier1 = new ShipmentSupplier("First Delivery", "FD");
        assertNotNull(supplier1);
        assertNotEquals(supplier.hashCode(), supplier1.hashCode());
    }

    @Test
    @DisplayName("compare shipment supplier with null")
    @Order(7)
    void compareShipmentSupplierWithNull() {
        assertNotEquals(supplier, null);
    }
}
