package product;

public class ShippableProduct extends Product implements Shippable {
    private final Double weight;

    public ShippableProduct(String name, Double price, Integer stock, Double weight) {
        super(name, price, stock);
        this.weight = weight;
    }

    @Override
    public Boolean isShippable() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public Double getWeight() {
        return weight;
    }
}
