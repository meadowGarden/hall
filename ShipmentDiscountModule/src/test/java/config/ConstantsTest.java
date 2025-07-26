package config;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("constants")
class ConstantsTest {

    @Test
    @DisplayName("LP corresponds to SUPPLIER_LP")
    void supplierLPAbbreviationCorrect() {
        assertEquals("LP", Constants.SUPPLIER_LP);
    }

    @Test
    @DisplayName("MR corresponds to SUPPLIER_MR")
    void supplierMRAbbreviationCorrect() {
        assertEquals("MR", Constants.SUPPLIER_MR);
    }

    @Test
    @DisplayName("10.0 corresponds to DISCOUNT_LIMIT_10")
    void discountLimit10Correct() {
        assertEquals(10.0, Constants.DISCOUNT_LIMIT_10);
    }
}
