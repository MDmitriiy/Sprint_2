import model.Meat;
import model.Apple;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            Meat meat = new Meat(5, 100);
            Apple redApples = new Apple(10, 50, Colour.RED);
            Apple greenApples = new Apple(8, 60, Colour.GREEN);
        cart.addItem(meat);
        cart.addItem(redApples);
        cart.addItem(greenApples);
            double totalSum1 = cart.getTotalSumWithoutDiscount();
            System.out.printf(" Общая сумма товаров в корзине: %.2f%n ", totalSum1);
            double totalSum2 = cart.getTotalSumWithDiscount();
            System.out.printf("Общая сумма товаров в корзине с учётом скидок: %.2f%n", totalSum2);
            double totalSum3 = cart.getTotalSumOfVegetarianProductsWithoutDiscount();
            System.out.printf(" Общая сумма фруктов в корзине: %.2f%n", totalSum3);
        }
}
