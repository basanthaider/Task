package product;

public abstract class Product {
    protected String name;
    protected Double price;
    protected Integer stock;

    public Product(String name, Double price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Boolean isExpired() {
        return false;
    }

    public Boolean isShippable() {
        return false;
    }
    public Boolean isAvailable(Integer quantity){
        if(stock>=quantity)
            return true;
        return false;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
