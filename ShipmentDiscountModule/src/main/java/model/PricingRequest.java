package model;

import shipment.CountryProfile;

import java.util.List;

public final class PricingRequest {
    private final List<String> transactions;
    private final CountryProfile country;

    public PricingRequest(final List<String> transactions, final CountryProfile country) {
        this.transactions = transactions;
        this.country = country;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public CountryProfile getCountryProfile() {
        return country;
    }
}
