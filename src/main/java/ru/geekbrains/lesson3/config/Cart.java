package ru.geekbrains.lesson3.config;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productsInCart = new ArrayList<>();

    public void put(Product product) {
        productsInCart.add(product);
        System.out.println("Товар добавлен");
    }

    public void delete(Product product) {
        if (!productsInCart.isEmpty()) {
            productsInCart.remove(product);
            System.out.println("Товар удален");
        } else {
            System.out.println("Корзина и так пуста");
        }
    }

    public void inCart() {
        System.out.println(productsInCart);
    }

    public void clear() {
        productsInCart.removeAll(productsInCart);
    }
}
