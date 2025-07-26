package shipment;

import enums.Country;

import java.util.ArrayList;
import java.util.List;

public final class CountryProfile {
    private final List<ShipmentSupplier> shipmentSuppliers;
    private Country country;

    public CountryProfile(final Country country) {
        this.country = country;
        this.shipmentSuppliers = new ArrayList<>();
    }

    public List<ShipmentSupplier> getShipmentSuppliers() {
        return this.shipmentSuppliers;
    }

    public boolean addShipmentSupplier(final ShipmentSupplier supplier) {
        if (shipmentSuppliers.contains(supplier))
            return false;

        return shipmentSuppliers.add(supplier);
    }

    public boolean removeShipmentSupplier(final ShipmentSupplier supplier) {
        if (supplier == null || !shipmentSuppliers.contains(supplier))
            return false;

        return shipmentSuppliers.remove(supplier);
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }
}
