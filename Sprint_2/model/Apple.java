package model;
import model.constants.Discount;
import model.constants.Colour;
import model.constants.Discountable;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;

    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        } else {
            return Discount.DEFAULT_DISCOUNT;
        }
    }
    public double getDiscountedPrice() {
        return amount*price * (1 - getDiscount());
    }
    @Override
    public double getPrice(){
        return price*amount;
    }
}

