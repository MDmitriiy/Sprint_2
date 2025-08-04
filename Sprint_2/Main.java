import model.Meat;
import model.Apple;
import service.ShoppingCart;

public class Main {
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            Meat meat = new Meat(5, 100, false);
            Apple redApples = new Apple(10, 50, "red", true);
            Apple greenApples = new Apple(8, 60, "green", true);
        cart.addItem(meat);
        cart.addItem(redApples);
        cart.addItem(greenApples);
            double totalSum1 = cart.getTotalSumWithoutDiscount();
            System.out.println("Общая сумма товаров в корзине " + totalSum1);
            double totalSum2 = cart.getTotalSumWithDiscount();
            System.out.println("Общая сумма товаров в корзине с учётом скидок: " + totalSum2);
            double totalSum3 = cart.getTotalSumOfVegetarianProductsWithoutDiscount();
            System.out.println("Общая сумма фруктов в корзине " + totalSum3);
        }
}
