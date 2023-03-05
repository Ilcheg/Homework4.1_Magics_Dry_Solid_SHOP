package ru.netology.market;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> cartItems = new ArrayList<>();

    public void addProductToCartByID(int id) {
        Product product = getProductByProductID(id);
        addToCart(product);
    }

    private Product getProductByProductID(int id) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod : products) {
            if (prod.getId() == id) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeProductByID(int id) {
        Product prod = getProductByProductID(id);
        cartItems.remove(prod);
    }

    public void printCartItems() {
        for (Product prod : cartItems) {
            System.out.println(prod.getName());
        }
    }
}