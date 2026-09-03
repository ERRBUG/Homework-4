package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] basket;
    private int size;

    public ProductBasket() {
        basket = new Product[5];
        size = 0;
    }

    public void addProduct(Product product) {
        if (size < basket.length) {
            basket[size] = product;
            size++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += basket[i].getPrice();
        }
        return total;
    }

    // Обновлённый метод печати – с учётом специальных товаров
    public void printBasket() {
        if (size == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        int specialCount = 0;
        for (int i = 0; i < size; i++) {
            Product p = basket[i];
            System.out.println(p); // используется переопределённый toString
            if (p.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (basket[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        size = 0;
    }
}