package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("package size")
class PackageSizeTest {
    @ParameterizedTest()
    @ValueSource(strings = {"S", "M", "L"})
    @DisplayName("get name from package size instance")
    void getInstancesFromString_Success(String value) {
        PackageSize result = PackageSize.from(value);
        switch (value) {
            case "S" -> Assertions.assertSame(PackageSize.SMALL, result);
            case "M" -> Assertions.assertSame(PackageSize.MEDIUM, result);
            case "L" -> Assertions.assertSame(PackageSize.LARGE, result);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"X", "", "sm", "1"})
    @DisplayName("wrong inputs to get instance from string")
    void invalidInput_throwsException(String value) {
        Assertions.assertThrows(IllegalStateException.class, () -> PackageSize.from(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"SMALL", "MEDIUM", "LARGE"})
    @DisplayName("get abbreviation from instance")
    void getAbbreviation_success(String enumName) {
        PackageSize size = PackageSize.valueOf(enumName);
        String abbreviation = size.getAbbreviation();

        switch (size) {
            case SMALL -> Assertions.assertEquals("S", abbreviation);
            case MEDIUM -> Assertions.assertEquals("M", abbreviation);
            case LARGE -> Assertions.assertEquals("L", abbreviation);
        }
    }
}
