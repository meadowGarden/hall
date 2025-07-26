package enums;

public enum PackageSize {
    SMALL,
    MEDIUM,
    LARGE;

    public static PackageSize from(final String s) {
        return switch (s) {
            case "S" -> SMALL;
            case "M" -> MEDIUM;
            case "L" -> LARGE;
            default -> throw new IllegalStateException("Unexpected value: " + s);
        };
    }

    public String getAbbreviation() {
        return switch (this) {
            case SMALL -> "S";
            case MEDIUM -> "M";
            case LARGE -> "L";
        };
    }
}
