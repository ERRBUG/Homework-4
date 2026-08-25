package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 100);
        Product banana = new Product("Банан", 80);
        Product milk = new Product("Молоко", 150);
        Product bread = new Product("Хлеб", 50);
        Product cheese = new Product("Сыр", 200);
        Product juice = new Product("Сок", 120);

        ProductBasket basket = new ProductBasket();

        System.out.println("Добавление продуктов");
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(juice);

        System.out.println("\nПечать корзины");
        basket.printBasket();

        System.out.println("\nОбщая стоимость");
        System.out.println("Стоимость: " + basket.getTotalCost());

        System.out.println("\nПоиск товаров");
        System.out.println("Есть ли 'Молоко'? " + basket.containsProduct("Молоко"));
        System.out.println("Есть ли 'Сок'?   " + basket.containsProduct("Сок"));

        System.out.println("\nОчистка корзины");
        basket.clearBasket();

        System.out.println("\nПечать после очистки");
        basket.printBasket();

        System.out.println("\nСтоимость после очистки");
        System.out.println("Стоимость: " + basket.getTotalCost());

        System.out.println("\nПоиск в пустой корзине");
        System.out.println("Есть ли 'Молоко'? " + basket.containsProduct("Молоко"));
    }
}