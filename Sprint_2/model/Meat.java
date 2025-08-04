package model;

public class Meat extends Food implements Food.Discountable {
    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
    }
    @Override
    public double getDiscount() {
        return price*amount;
    }
    @Override
    public double getDiscountedPrice(){
        return price*amount;
    }
    @Override
    public double getPrice(){
        return price*amount;
    }
}
