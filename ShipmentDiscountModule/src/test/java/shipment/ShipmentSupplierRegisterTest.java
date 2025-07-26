package shipment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("shipment supplier register")
class ShipmentSupplierRegisterTest {

    @AfterEach
    void tearDownAfterEach() {
        ShipmentSupplierRegister.clearRegister();
    }

    @Test
    @DisplayName("do not allow to use of the same abbreviation more than once")
    void forbiddenToUseAbbreviationMoreThanSingleTime() {
        ShipmentSupplier firstSupplier = new ShipmentSupplier("High Delivery", "HD");
        ShipmentSupplierRegister.addToRegister(firstSupplier);
        ShipmentSupplier secondSupplier = new ShipmentSupplier("High Delivery", "HD");
        assertThrows(UnsupportedOperationException.class, () -> ShipmentSupplierRegister.addToRegister(secondSupplier));
    }

    @Test
    @DisplayName("remove shipment supplier from register, confirmed")
    void removeFromRegister() {
        ShipmentSupplier supplier = new ShipmentSupplier("High Delivery", "HD");
        ShipmentSupplierRegister.addToRegister(supplier);
        ShipmentSupplierRegister.removeFromRegister(supplier);
        assertEquals(0, ShipmentSupplierRegister.getRegister().size());
    }
}
