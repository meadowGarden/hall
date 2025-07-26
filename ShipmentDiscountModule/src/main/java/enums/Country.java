package enums;

public enum Country {
    FRANCE,
    GERMANY,
    SPAIN;

    public String getCountryName() {
        return switch (this) {
            case FRANCE -> "France";
            case GERMANY -> "Germany";
            case SPAIN -> "Spain";
        };
    }
}
