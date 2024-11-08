package org.example;

abstract public class Product {
    private String name;
    private double price;


    public Product(String nombre, double precio) {
        this.name = nombre;
        this.price = precio;
    }

    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return price;
    }


    public abstract double getPrice();
}
