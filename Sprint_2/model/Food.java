package model;

public abstract class Food {
    protected int amount;
    protected double price;

    public double getPrice() {
        return price;
    }

    protected boolean isVegetarian;

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public abstract double getDiscountedPrice();

    interface Discountable {
        double getDiscount();
    }
}

