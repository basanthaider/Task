package service;

import cart.Cart;
import cart.CartItem;
import product.Shippable;
import user.Customer;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        double subtotal = 0.0;
        List<Shippable> shippings = new ArrayList<>();

        for (CartItem item : cart.getCartItems()) {
            if (item.quantity > item.product.getStock()) {
                System.out.println("Insufficient quantity for " + item.product.getName());
                return;
            }
        }


        for (CartItem item : cart.getCartItems()) {
            subtotal += item.product.getPrice() * item.quantity;

            if (item.product.isShippable()) {
                Shippable shippable = (Shippable) item.product;
                for (int i = 0; i < item.quantity; i++) {
                    shippings.add(shippable);
                }
            }
        }

        double shippingCost = shippings.isEmpty() ? 0 : 30;
        double total = subtotal + shippingCost;


        if (!customer.canAfford(total)) {
            System.out.println("Insufficient balance");
            return;
        }


        for (CartItem item : cart.getCartItems()) {
            int updatedStock = item.product.getStock() - item.quantity;
            item.product.setStock(updatedStock);
        }

        customer.reduceBalance(total);

        if (!shippings.isEmpty()) {
            ShippingService.ship(shippings);
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getCartItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + "           " + (item.product.getPrice() * item.quantity));
        }
        System.out.println("----------------------");
        System.out.println("Subtotal            " + subtotal);
        System.out.println("Shipping            " + shippingCost);
        System.out.println("Amount              " + total);
        System.out.println(customer.getName() + " remaining balance " + customer.getBalance());
    }
}





