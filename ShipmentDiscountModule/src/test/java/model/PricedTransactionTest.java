package model;

import enums.PackageSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("priced transaction")
class PricedTransactionTest {
    Transaction transaction;
    PricedTransaction pricedTransaction;

    @BeforeEach
    void setUpBeforeEach() {
        ZonedDateTime date = ZonedDateTime.of(2010, 5, 9, 0, 0, 0, 0, ZoneId.of("UTC"));
        transaction = new Transaction(date, PackageSize.MEDIUM, "MR");
        pricedTransaction = new PricedTransaction(transaction, 3);
    }

    @Test
    @DisplayName("get transaction from priced transaction")
    void getTransaction_success() {
        assertEquals(transaction, pricedTransaction.getTransaction());
    }

    @Test
    @DisplayName("failure to create priced transaction, null input transaction")
    void getTransaction_failureNullTransaction() {
        assertThrows(UnsupportedOperationException.class, () -> new PricedTransaction(null, 2.0));
    }

    @Test
    @DisplayName("failure to create priced transaction, negative price")
    void getTransaction_failureNegativePrice() {
        assertThrows(UnsupportedOperationException.class, () -> new PricedTransaction(transaction, -2.0));
    }

    @Test
    @DisplayName("set transaction from priced transaction")
    void setTransaction_success() {
        ZonedDateTime date = ZonedDateTime.of(2010, 5, 10, 0, 0, 0, 0, ZoneId.of("UTC"));
        Transaction secondTransaction = new Transaction(date, PackageSize.MEDIUM, "MR");
        pricedTransaction.setTransaction(secondTransaction);
        assertEquals(secondTransaction, pricedTransaction.getTransaction());
    }

    @Test
    @DisplayName("failure to set transaction from priced transaction")
    void setTransaction_failure() {
        assertThrows(UnsupportedOperationException.class, () -> pricedTransaction.setTransaction(null));
    }

    @Test
    @DisplayName("get price of priced transaction")
    void getPrice() {
        assertEquals(3, pricedTransaction.getPrice());
    }

    @Test
    @DisplayName("set price of priced transaction")
    void setPrice_success() {
        pricedTransaction.setPrice(4);
        assertEquals(4, pricedTransaction.getPrice());
    }

    @Test
    @DisplayName("failure to set negative price of priced transaction")
    void setPrice_failure() {
        assertThrows(UnsupportedOperationException.class, () ->pricedTransaction.setPrice(-4));
    }

    @Test
    @DisplayName("get discount of priced transaction")
    void getDiscount() {
        assertEquals(0, pricedTransaction.getDiscount());
    }

    @Test
    @DisplayName("set discount of priced transaction")
    void setDiscount_success() {
        pricedTransaction.setDiscount(0.99);
        assertEquals(0.99, pricedTransaction.getDiscount());
    }

    @Test
    @DisplayName("failure to set discount of priced transaction, negative discount")
    void setDiscount_failure() {
        assertThrows(UnsupportedOperationException.class, () -> pricedTransaction.setDiscount(-0.99));
    }

    @Test
    @DisplayName("to string method works")
    void testToString() {
        assertEquals("2010-05-09 M MR 3,00 -", pricedTransaction.toString());
    }
}
