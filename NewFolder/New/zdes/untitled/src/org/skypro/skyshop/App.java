package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {

        Product apple = new SimpleProduct("Яблоко", 100);
        Product banana = new SimpleProduct("Банан", 80);
        Product milk = new DiscountedProduct("Молоко", 150, 10);
        Product bread = new SimpleProduct("Хлеб", 50);
        Product cheese = new FixPriceProduct("Сыр");
        Product juice = new DiscountedProduct("Сок", 120, 5);

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