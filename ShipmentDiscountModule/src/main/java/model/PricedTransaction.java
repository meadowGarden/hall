package model;
/*
used wrapper class, instead of inheritance of class transaction to have less coupled architecture
 */

public final class PricedTransaction {
    private Transaction transaction;
    private double price;
    private double discount;

    public PricedTransaction(
            final Transaction transaction,
            final double price
    ) {
        if (transaction == null)
            throw new UnsupportedOperationException("Transaction cannot be null");

        if (price < 0)
            throw new UnsupportedOperationException("Price cannot be negative");

        this.transaction = transaction;
        this.price = price;
        this.discount = 0;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(final Transaction transaction) {
        if (transaction == null)
            throw new UnsupportedOperationException("Transaction cannot be null");

        this.transaction = transaction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        if (price < 0)
            throw new UnsupportedOperationException("Price cannot be negative");

        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(final double discount) {
        if (discount < 0)
            throw new UnsupportedOperationException("Discount cannot be negative");

        this.discount = discount;
    }

    @Override
    public String toString() {
        if (!this.transaction.isServiceable())
            return this.transaction.toString();

        String discountToDisplay = Double.compare(discount, 0) == 0 ? "-" : String.valueOf("%.2f".formatted(this.discount));
        return "%s %.2f %s".formatted(this.transaction, this.price, discountToDisplay);
    }
}
