package product;

public class SimpleProduct extends Product{
    public SimpleProduct(String name, Double price, Integer stock) {
        super(name, price, stock);
    }

    @Override
    public Boolean isExpired() {
        return false;
    }
}
