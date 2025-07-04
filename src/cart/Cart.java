package cart;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();

    public void add(Product product, Integer quantity) {
        if (!product.isAvailable(quantity)) {
            System.out.println("product: " + product.getName() + " is out of stock!");
        }
        else if (product.isExpired()) {
            System.out.println("product: " + product.getName() + " is expired!");
        }
        cartItems.add(new CartItem(product,quantity));
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
    public Boolean isEmpty(){
        return cartItems.isEmpty();
    }
}
