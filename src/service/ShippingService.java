package service;

import product.Shippable;

import java.util.List;

public class ShippingService {
    public static void ship(List<Shippable>items){
        Double totalWeight =0.0;
        System.out.println("** Shipment notice **");
        for (Shippable item : items) {
            System.out.println(item.getName() + "      " + item.getWeight() * 1000 + "g");
            totalWeight += item.getWeight();
        }
        System.out.println("Total package weight " + totalWeight + "kg");
    }

}
