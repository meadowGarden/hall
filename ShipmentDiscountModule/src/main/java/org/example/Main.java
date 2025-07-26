package org.example;

import config.Constants;
import enums.Country;
import enums.PackageSize;
import model.PricingRequest;
import pricing.ShipmentDiscountModule;
import shipment.CountryProfile;
import shipment.ShipmentSupplier;
import shipment.ShipmentSupplierRegister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* it was assumed that shipment, country profiles and suppliers classes are not existent in current code base,
* so they were added here. Main class is for initializing circumstantial classes and running price calculating module.
* */

public class Main {
    public static void main(String[] args) {
        final ShipmentSupplier supplierMondialRelay =
                getSupplier(Constants.SUPPLIER_MR, "MR", 2, 3, 4);

        if (supplierMondialRelay != null)
            ShipmentSupplierRegister.addToRegister(supplierMondialRelay);

        final ShipmentSupplier supplierLaPoste =
                getSupplier(Constants.SUPPLIER_LP, "LP", 1.5, 4.9, 6.9);

        if (supplierLaPoste != null)
            ShipmentSupplierRegister.addToRegister(supplierLaPoste);

        if (supplierMondialRelay == null || supplierLaPoste == null) {
            System.err.println("Could not create a supplier");
            return;
        }

        final CountryProfile countryProfile001 = getCountry(Country.FRANCE, supplierMondialRelay, supplierLaPoste);
        final List<String> usersTransactions001 = getUsersTransactions();
        final PricingRequest request = new PricingRequest(usersTransactions001, countryProfile001);

        ShipmentDiscountModule.run(request);
    }

    // code below is for initial data set up - extract transactions as strings from the file and create the country profile

    private static List<String> getUsersTransactions() {
        final List<String> transactions = new ArrayList<>();

        try (final BufferedReader reader = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(Main.class.getClassLoader().getResourceAsStream("input.txt"))))) {

            String line;
            while ((line = reader.readLine()) != null )
                transactions.add(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }

    private static CountryProfile getCountry(final Country country, final ShipmentSupplier... suppliers) {
        final CountryProfile countryProfile = new CountryProfile(country);

        for (ShipmentSupplier shipmentSupplier : suppliers)
            if(countryProfile.addShipmentSupplier(shipmentSupplier))
                System.out.printf("%s added to %s%n".formatted(shipmentSupplier.getName(), country.getCountryName()));

        return countryProfile;
    }

    private static ShipmentSupplier getSupplier(
            final String name,
            final String abbreviation,
            final double priceSmall,
            final double priceMedium,
            final double priceLarge
    ) {
        final Map<PackageSize, Double> priceList = new HashMap<>(Map.ofEntries(
                Map.entry(PackageSize.SMALL, priceSmall),
                Map.entry(PackageSize.MEDIUM, priceMedium),
                Map.entry(PackageSize.LARGE, priceLarge)
        ));

        try {
            final ShipmentSupplier supplier = new ShipmentSupplier(name, abbreviation);
            supplier.setPriceList(priceList);
            return supplier;
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
