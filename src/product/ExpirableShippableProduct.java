package product;

import java.time.LocalDate;

public class ExpirableShippableProduct extends ExpirableProduct implements Shippable {
    private Double weight;

    public ExpirableShippableProduct(String name, Double price, Integer stock, LocalDate expiryDate, Double weight) {
        super(name, price, stock, expiryDate);
        this.weight=weight;
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
