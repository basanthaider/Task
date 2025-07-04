package cart;

import product.Product;

public class CartItem {
    public Product product;
    public Integer quantity;

    public CartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
