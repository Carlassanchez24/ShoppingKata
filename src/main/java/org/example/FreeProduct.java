package org.example;

public class FreeProduct extends Product{
    public FreeProduct(String name, double price) {
        super(name, 0.0);
    }

    @Override
    public double getPrice() {
        return 0.0;

    }
}
