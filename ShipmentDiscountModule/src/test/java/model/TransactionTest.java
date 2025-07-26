package model;

import enums.PackageSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("transaction")
class TransactionTest {
    Transaction transaction;

    @BeforeEach
    void setUpBeforeEach() {
        ZonedDateTime date = ZonedDateTime.of(2010, 5, 9, 0, 0, 0, 0, ZoneId.of("UTC"));
        transaction = new Transaction(date, PackageSize.MEDIUM, "MR");
    }

    @Test
    @DisplayName("create serviceable transaction")
    void createServiceableTransaction_success() {
        Transaction transaction = new Transaction(ZonedDateTime.now(), PackageSize.SMALL, "LP");
        assertNotNull(transaction);
        assertTrue(transaction.isServiceable());
    }

    @Test
    @DisplayName("create unserviceable transaction")
    void createUnserviceableTransaction_success() {
        Transaction transaction = new Transaction(ZonedDateTime.now(), PackageSize.SMALL, "LP", false);
        assertNotNull(transaction);
        assertFalse(transaction.isServiceable());
    }

    @Test
    @DisplayName("get transaction date")
    void getDate() {
        ZonedDateTime data = transaction.getDate();
        assertNotNull(data);
        assertEquals(2010, data.getYear());
        assertEquals(5, data.getMonthValue());
        assertEquals(9, data.getDayOfMonth());
    }

    @Test
    @DisplayName("set transaction date")
    void setDate() {
        ZonedDateTime date = ZonedDateTime.now();
        transaction.setDate(date);
        assertEquals(date, transaction.getDate());
    }

    @Test
    @DisplayName("get package size")
    void getSize() {
        assertSame(PackageSize.MEDIUM, transaction.getSize());
    }

    @Test
    @DisplayName("set package size")
    void setSize() {
        transaction.setSize(PackageSize.LARGE);
        assertSame(PackageSize.LARGE, transaction.getSize());
    }

    @Test
    @DisplayName("get shipment supplier abbreviation")
    void getSupplierAbbreviation() {
        assertEquals("MR", transaction.getSupplierAbbreviation());
    }

    @Test
    @DisplayName("set shipment supplier abbreviation")
    void setSupplierAbbreviation() {
        transaction.setSupplierAbbreviation("MR");
        assertEquals("MR", transaction.getSupplierAbbreviation());
    }

    @Test
    @DisplayName("transaction serviceable")
    void isServiceable() {
        assertTrue(transaction.isServiceable());
    }

    @Test
    @DisplayName("to string method")
    void testToString() {
        assertEquals("2010-05-09 M MR", transaction.toString());
    }

    @Test
    @DisplayName("equality to itself")
    void testItselfEquality() {
        assertTrue(transaction.equals(transaction));
    }

    @Test
    @DisplayName("same data transaction equality")
    void testTransactionSameDataEquality() {
        ZonedDateTime date = ZonedDateTime.of(2010, 5, 9, 0, 0, 0, 0, ZoneId.of("UTC"));
        Transaction secondTransaction = new Transaction(date, PackageSize.MEDIUM, "MR");
        assertEquals(transaction, secondTransaction);
        assertEquals(transaction.hashCode(), secondTransaction.hashCode());
    }

    @Test
    @DisplayName("different data transaction equality")
    void testTransactionDifferentDataEquality() {
        ZonedDateTime date = ZonedDateTime.of(2010, 5, 10, 0, 0, 0, 0, ZoneId.of("UTC"));
        Transaction secondTransaction = new Transaction(date, PackageSize.MEDIUM, "MR");
        assertNotEquals(transaction, secondTransaction);

        assertNotEquals(transaction.hashCode(), secondTransaction.hashCode());
    }
    @Test
    @DisplayName("null transaction equality")
    void testTransactionNullEquality() {
        assertNotEquals(transaction, null);
    }
}
