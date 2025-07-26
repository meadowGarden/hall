package enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("country")
class CountryTest {
    @ParameterizedTest
    @EnumSource(Country.class)
    @DisplayName("get country name from instance")
    void getCountryName_success(Country country) {
        switch (country) {
            case FRANCE -> assertEquals("France", country.getCountryName());
            case GERMANY -> assertEquals("Germany", country.getCountryName());
            case SPAIN -> assertEquals("Spain", country.getCountryName());
        }
    }
}
