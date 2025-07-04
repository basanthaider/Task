package product;

import java.time.LocalDate;

public class ExpirableProduct extends Product {
    private LocalDate expiryDate;

    public ExpirableProduct(String name, Double price, Integer stock, LocalDate expiryDate) {
        super(name, price, stock);
        this.expiryDate=expiryDate;
    }

    @Override
    public Boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }
}
