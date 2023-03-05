package ru.netology.market;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private final List<Product> products = new ArrayList<>();

    public Products() {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initStoreItems() {
        String[] productNames = {"Молоко", "Хлеб", "Творог"};
        Double[] productPrice = {70.00, 60.00, 120.00};
        Integer[] quantity = {30, 5, 3};

        for (int i = 0; i < productNames.length; i++) {
            this.products.add(new Product(i + 1, productNames[i], productPrice[i], quantity[i]));
        }
    }
}

