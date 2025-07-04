package user;

public class Customer {
    private String name;
    private Double balance;

    public Customer(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean canAfford(Double amount) {
        return balance >= amount;

    }
    public void reduceBalance(Double amount){
        balance-=amount;
    }
    public Double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
