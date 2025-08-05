package model.constants;

public abstract class Discount {
    public static final double RED_APPLE_DISCOUNT = 0.6;
    public static final double DEFAULT_DISCOUNT = 0;
    public interface Discountable {
        double getDiscount();
    }
}
