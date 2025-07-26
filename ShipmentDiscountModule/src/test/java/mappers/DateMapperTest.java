package mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DateTimeException;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("date mapper")
class DateMapperTest {
    @Test
    @DisplayName("map date from string")
    void mapZonedDateTime_success() {
        String stringDate = "2011-01-13";
        ZonedDateTime zonedDateTime = DateMapper.zonedDateTimeFromString(stringDate);
        Assertions.assertEquals(zonedDateTime.getYear(), 2011);
        Assertions.assertEquals(zonedDateTime.getMonthValue(), 1);
        Assertions.assertEquals(zonedDateTime.getDayOfMonth(), 13);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2011-0-13", "2011-13-13"})
    @DisplayName("failure to map from incorrect month")
    void mapZonedDateTime_failureMonth(String s) {
        assertThrows(DateTimeException.class, () -> DateMapper.zonedDateTimeFromString(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2011-01-0", "2011-13-32"})
    @DisplayName("failure to map from incorrect day")
    void mapZonedDateTime_failureDay(String s) {
        assertThrows(DateTimeException.class, () -> DateMapper.zonedDateTimeFromString(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-2011-01-01", "2011--1-01", "2011-01--1"})
    @DisplayName("failure to map with negative numbers")
    void mapZonedDateTime_failureNegativeNumbers(String s) {
        assertThrows(NumberFormatException.class, () -> DateMapper.zonedDateTimeFromString(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2o11-o1-o1", "2011-a1-a1"})
    @DisplayName("failure to map with letters instead of numbers")
    void mapZonedDateTime_failureLettersInsteadOfNumbers(String s) {
        assertThrows(NumberFormatException.class, () -> DateMapper.zonedDateTimeFromString(s));
    }
}
