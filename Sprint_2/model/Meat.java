package model;

import model.constants.Discountable;

public class Meat extends Food implements Discountable {
    public Meat(int amount, double price) {
        super(amount, price,false);
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
