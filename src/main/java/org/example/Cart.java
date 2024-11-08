package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> carrito = new ArrayList<>();


    public void viewCart() {
        for (Product product : carrito) {
            System.out.println("Nombre: " + product.getName());
        }
    }


    public void addProduct(Product product) {
        try {
            for (Product item : carrito) {
                if (item.getName().equals(product.getName())) {
                    throw new IllegalArgumentException("El producto ya existe en el carrito");
                }
            }
            carrito.add(product);
            System.out.println("Producto añadido al carrito: " + product.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProduct(String name) {
        carrito.removeIf(product -> product.getName().equals(name));
    }

    public void numberProduct() {
        System.out.println("Numero de productos: " + carrito.size());
    }

    public double totalPriceCart() {
        double totalPrice = 0;
        for (Product product : carrito) {
            totalPrice += product.getPrice();
        }
        System.out.println("Precio total del carrito: " + totalPrice + "€");
        return totalPrice;
    }

}
