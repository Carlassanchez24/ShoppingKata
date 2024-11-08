package org.example;

public class Book extends Product {
    private final String author;
    private final String description;
    private double discount;

    public Book(String name, int price, String author, String description, double discount) {
        super(name, price);
        this.author = author;
        this.description = description;
        this.discount = discount;

    }


    @Override
    public double getPrice() {
        if (discount > 10) {
            discount = 10;
        }
        return getBasePrice() * (1 - discount / 100);
    }
}
