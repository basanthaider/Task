import cart.Cart;
import product.ExpirableShippableProduct;
import product.Product;
import product.ShippableProduct;
import product.SimpleProduct;
import service.CheckoutService;
import user.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Bassant", 1000.0);

        Product cheese = new ShippableProduct("Cheese", 100.0, 5, 0.2);
        Product biscuits = new ShippableProduct("Biscuits", 150.0, 5, 0.7);
        Product scratchCard = new SimpleProduct("ScratchCard", 50.0, 10);
        Product turkey = new ExpirableShippableProduct("Turkey", 100.0, 10, LocalDate.of(2025, 7, 30),0.2);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);
        cart.add(turkey,2);

        CheckoutService.checkout(customer, cart);
    }
}