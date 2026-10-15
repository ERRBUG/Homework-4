package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private final List<Product> basket = new ArrayList<>();

    public void addProduct(Product product) {
        basket.add(product);
    }

    public int getTotalCost() {
        int total = 0;
        for (Product product : basket) {
            total += product.getPrice();
        }
        return total;
    }

    public void printBasket() {
        if (basket.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }
        int specialCount = 0;
        for (Product p : basket) {
            System.out.println(p);
            if (p.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProduct(String name) {
        for (Product product : basket) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        basket.clear();
    }

    public List<Product> removeProductByName(String name) {
        List<Product> removed = new ArrayList<>();
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                removed.add(product);
                iterator.remove();
            }
        }
        return removed;
    }
}