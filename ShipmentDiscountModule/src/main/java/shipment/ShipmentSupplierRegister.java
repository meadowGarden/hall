package shipment;

import java.util.HashMap;
import java.util.Map;

/*
there may be dozens of shipment suppliers in a single country
to tell them apart there was a need for some unique attribute
for that task suppliers abbreviation was chosen
to have a way to track uniqueness, but keep concerns apart ShipmentSupplier class, ShipmentSupplierRegister class was created
 */
public final class ShipmentSupplierRegister {
    private static final Map<String, ShipmentSupplier> register = new HashMap<>();

    public static void addToRegister(final ShipmentSupplier supplierToAdd) throws UnsupportedOperationException {
        if (register.containsKey(supplierToAdd.getAbbreviation()))
            throw new UnsupportedOperationException("Supplier with an \"%s\" already exists".formatted(supplierToAdd.getAbbreviation()));

        register.put(supplierToAdd.getAbbreviation(), supplierToAdd);
    }

    public static void removeFromRegister(final ShipmentSupplier supplierToRemove) {
        register.remove(supplierToRemove.getAbbreviation(), supplierToRemove);
    }

    public static Map<String, ShipmentSupplier> getRegister() {
        return register;
    }

    public static void clearRegister() {
        register.clear();
    }
}
