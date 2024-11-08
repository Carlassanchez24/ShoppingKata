package org.example;

public class FoodProduct extends Product {
    private double discount;


    public FoodProduct(String name, double price, double descuento) {
        super(name, price);
        this.discount = descuento;
    }

    @Override
    public double getPrice() {
        return getBasePrice() * (1 - discount /100);
    }

}
