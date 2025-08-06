package service;

import java.util.ArrayList;
import java.util.List;
import model.Food;

public class ShoppingCart{
    private List<Food> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void addItem(Food item) {
        items.add(item);
    }
    public double getTotalSumWithoutDiscount() {
        double totalSum = 0;
        for (Food item : items) {
            totalSum += item.getPrice();
        }
        return totalSum;
    }
    public double getTotalSumWithDiscount() {
        double totalSum = 0;
        for (Food item : items) {
            totalSum += item.getDiscountedPrice();
        }
        return totalSum;
    }
    public double getTotalSumOfVegetarianProductsWithoutDiscount() {
        double totalSum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                totalSum += item.getPrice();
            }
        }
        return totalSum;
    }
}