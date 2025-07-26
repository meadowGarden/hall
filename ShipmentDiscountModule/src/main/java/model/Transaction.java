package model;

import enums.PackageSize;

import java.time.ZonedDateTime;
import java.util.Objects;

public final class Transaction {
    private ZonedDateTime date;
    private PackageSize size;
    private String supplierAbbreviation;
    private final boolean isServiceable;
    private String nonServiceableString;

    public Transaction(final ZonedDateTime date, final PackageSize size, final String supplierAbbreviation) {
        this(date, size, supplierAbbreviation, true);
    }

    public Transaction(
            final ZonedDateTime date,
            final PackageSize size,
            final String supplierAbbreviation,
            final boolean isServiceable
    ) {
        this.date = date;
        this.size = size;
        this.supplierAbbreviation = supplierAbbreviation;
        this.isServiceable = isServiceable;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(final ZonedDateTime date) {
        this.date = date;
    }

    public PackageSize getSize() {
        return size;
    }

    public void setSize(final PackageSize size) {
        this.size = size;
    }

    public String getSupplierAbbreviation() {
        return supplierAbbreviation;
    }

    public void setSupplierAbbreviation(final String supplierAbbreviation) {
        this.supplierAbbreviation = supplierAbbreviation;
    }

    public boolean isServiceable() {
        return isServiceable;
    }

    public void setNonServiceableString(final String nonServiceableString) {
        this.nonServiceableString = nonServiceableString;
    }

    @Override
    public String toString() {
        if (!isServiceable)
            return "%s Ignored".formatted(nonServiceableString);

        final String dateToDisplay = "%s-%02d-%02d"
                .formatted(this.date.getYear(), this.date.getMonthValue(), this.date.getDayOfMonth());

        return "%s %s %s"
                .formatted(dateToDisplay, this.size.getAbbreviation(), this.supplierAbbreviation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || this.getClass() != o.getClass())
            return false;

        Transaction that = (Transaction) o;

        return this.isServiceable == that.isServiceable &&
                Objects.equals(date, that.date) &&
                this.size == that.size &&
                Objects.equals(supplierAbbreviation, that.supplierAbbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, size, supplierAbbreviation, isServiceable);
    }
}
