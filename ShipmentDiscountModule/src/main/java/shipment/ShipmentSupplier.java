package shipment;

import enums.PackageSize;

import java.util.*;

public final class ShipmentSupplier {
    private String name;
    private final String abbreviation;
    private Map<PackageSize, Double> priceList;

    public ShipmentSupplier(final String name, final String abbreviation) {
        this(name, abbreviation, new HashMap<>());
    }

    public ShipmentSupplier(final String name, final String abbreviation, final Map<PackageSize, Double> priceList) {
        this.name = name;
        this.priceList = priceList;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public Map<PackageSize, Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(final Map<PackageSize, Double> priceList) {
        this.priceList = priceList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.abbreviation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || this.getClass() != o.getClass())
            return false;

        ShipmentSupplier that = (ShipmentSupplier) o;

        return Objects.equals(this.abbreviation, that.abbreviation);
    }
}
