package mappers;

import enums.PackageSize;
import model.Transaction;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@DisplayName("transaction mapper")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TransactionMapperTest {

    @Test
    @DisplayName("map transaction")
    @Order(1)
    void mapTransaction_success() {
        String stringTransaction = "2015-02-11 L LP";

        Transaction transaction = TransactionMapper.transactionFromString(stringTransaction);

        assertNotNull(transaction);
        assertSame(transaction.getSize(), PackageSize.LARGE);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2015-02-30 L LP", "2015-13-30 L LP"})
    @DisplayName("failure to map transaction, bad date")
    @Order(2)
    void mapTransaction_failureBadDate(String s) {
        Assertions.assertThrows(DateTimeException.class, () -> TransactionMapper.transactionFromString(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2015-02-01 X LP", "2015-02-01 _ LP"})
    @DisplayName("failure to map transaction, unsupported package size")
    @Order(3)
    void mapTransaction_failureBadSupplier(String s) {
        Assertions.assertThrows(IllegalStateException.class, () -> TransactionMapper.transactionFromString(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2015-02-01 LP", "L LP", " "})
    @DisplayName("failure to map transaction, wrong number of columns or unfamiliar shipment supplier")
    @Order(4)
    void mapTransaction_failureInputFormat(String s) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> TransactionMapper.transactionFromString(s));
    }
}
