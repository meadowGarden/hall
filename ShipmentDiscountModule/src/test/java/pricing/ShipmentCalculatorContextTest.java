package pricing;

import enums.Country;
import enums.PackageSize;
import model.PricedTransaction;
import model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import shipment.CountryProfile;
import shipment.ShipmentSupplier;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("shipment calculator context")
class ShipmentCalculatorContextTest {
    ShipmentCalculatorContext context;
    CountryProfile countryProfile;

    @BeforeEach
    void setUpBeforeEach() {
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
        ShipmentSupplier supplier002 = new ShipmentSupplier("La Poste", "MR", priceList0002);

        countryProfile = new CountryProfile(Country.FRANCE);
        countryProfile.addShipmentSupplier(supplier001);
        countryProfile.addShipmentSupplier(supplier002);

        context = new ShipmentCalculatorContext(countryProfile);
    }

    @Test
    @DisplayName("failure to create context, country profile is null")
    void createContext_failureProfileNull() {
        assertThrows(UnsupportedOperationException.class, () -> new ShipmentCalculatorContext(null));
    }

    @Test
    @DisplayName("apply feasible discount, fully")
    void applyFeasibleDiscountToTransaction_successFull() {
        Transaction transaction = new Transaction(ZonedDateTime.now(), PackageSize.LARGE, "MR");
        PricedTransaction pricedTransaction = new PricedTransaction(transaction, 5);
        context.setPricedTransaction(pricedTransaction);
        context.setFeasibleDiscount(1.5);

        context.applyFeasibleDiscountToTransaction();

        assertEquals(3.5, pricedTransaction.getPrice());
        assertEquals(1.5, pricedTransaction.getDiscount());
    }

    @Test
    @DisplayName("apply feasible discount, partially when discount is bigger that price")
    void applyFeasibleDiscountToTransaction_successPartialPriceSmallerThanDiscount() {
        Transaction transaction = new Transaction(ZonedDateTime.now(), PackageSize.LARGE, "MR");
        PricedTransaction pricedTransaction = new PricedTransaction(transaction, 5);
        context.setPricedTransaction(pricedTransaction);
        context.setFeasibleDiscount(6.5);

        context.applyFeasibleDiscountToTransaction();

        assertEquals(0, pricedTransaction.getPrice());
        assertEquals(5, pricedTransaction.getDiscount());
    }

    @Test
    @DisplayName("apply feasible discount, partially")
    void applyFeasibleDiscountToTransaction_successPartial() {
        Transaction transaction = new Transaction(ZonedDateTime.now(), PackageSize.LARGE, "MR");
        PricedTransaction pricedTransaction = new PricedTransaction(transaction, 20);
        context.setPricedTransaction(pricedTransaction);
        context.setMonthDiscountCap(10);
        context.setFeasibleDiscount(10);

        context.applyFeasibleDiscountToTransaction();

        assertEquals(10, pricedTransaction.getPrice());
        assertEquals(10, pricedTransaction.getDiscount());
    }

    @Test
    @DisplayName("reset feasible discount")
    void resetFeasibleDiscount() {
        context.setFeasibleDiscount(6);
        context.resetFeasibleDiscount();
        assertEquals(0, context.getFeasibleDiscount());
    }

    @Test
    @DisplayName("evaluate month change")
    void evaluateMonth_change() {
        // set up
        context.evaluateMonth(2);
        context.setMonthDiscountCap(10);
        context.setIsLargeShipmentFree(true);

        // execution
        context.setIsLargeShipmentFree(false);
        context.setFeasibleDiscount(5);
        context.evaluateMonth(3);

        // assertion
        assertTrue(context.isLargeShipmentLPFree());
        assertEquals(10, context.getMonthDiscountCap());
        assertEquals(10, context.getDiscountPool());
    }

    @Test
    @DisplayName("increase large LP shipment count by one")
    void increaseLargeShipmentLPCount() {
        context.setLargeShipmentLPCount(0);
        context.increaseLargeShipmentLPCount();
        assertEquals(1, context.getLargeShipmentLPCount());
    }

    @Test
    @DisplayName("get state of shipment for LP large is true")
    void shipmentFreeForLargeLP_success() {
        context.setIsLargeShipmentFree(true);
        assertTrue(context.isLargeShipmentLPFree());
    }

    @Test
    @DisplayName("after being used once free shipment for LP large is false")
    void afterBeingUsedIsShipmentFreeForLargeLP_success() {
        context.setIsLargeShipmentFree(false);
        assertFalse(context.isLargeShipmentLPFree());
    }

    @Test
    @DisplayName("failure to set priced transaction, null input transaction")
    void setPricedTransaction_failureNullTransaction() {
        assertThrows(UnsupportedOperationException.class, () -> context.setPricedTransaction(null));
    }

    @Test
    @DisplayName("failure to set month discount cap, negative input value")
    void setMonthCap_failureNegativeInput() {
        assertThrows(UnsupportedOperationException.class, () -> context.setMonthDiscountCap(-20));
    }

    @Test
    @DisplayName("failure to set discount pool, negative input value")
    void setDiscountPool_failureNegativeInput() {
        assertThrows(UnsupportedOperationException.class, () -> context.setDiscountPool(-20));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 13})
    @DisplayName("failure to evaluate month, bad value")
    void evaluateMonth_failureNegativeInput(int i) {
        assertThrows(UnsupportedOperationException.class, () -> context.evaluateMonth(i));
    }

    @Test
    @DisplayName("failure to set LP large count, negative input value")
    void setLargeShipmentLPCount_failureNegativeInput() {
        assertThrows(UnsupportedOperationException.class, () -> context.setLargeShipmentLPCount(-2));
    }

    @Test
    @DisplayName("failure to set discount pool, negative input value")
    void setFeasibleDiscount_failureNegativeInput() {
        assertThrows(UnsupportedOperationException.class, () -> context.setFeasibleDiscount(-2));
    }

}
