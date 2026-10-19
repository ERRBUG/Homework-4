package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.BestResultNotFound;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Проверка корректности данных ===");
        try { new SimpleProduct("", 100); }
        catch (IllegalArgumentException e) { System.out.println("Ошибка: " + e.getMessage()); }

        try { new SimpleProduct("Тестовый", 0); }
        catch (IllegalArgumentException e) { System.out.println("Ошибка: " + e.getMessage()); }

        try { new DiscountedProduct("Скидочный", 100, 150); }
        catch (IllegalArgumentException e) { System.out.println("Ошибка: " + e.getMessage()); }

        System.out.println("Проверки прошли, создаём корректные товары...\n");

        Product apple = new SimpleProduct("Яблоко", 100);
        Product banana = new SimpleProduct("Банан", 80);
        Product milk = new DiscountedProduct("Молоко", 150, 10);
        Product bread = new SimpleProduct("Хлеб", 50);
        Product cheese = new FixPriceProduct("Сыр");
        Product juice = new DiscountedProduct("Сок", 120, 5);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(juice);

        System.out.println("=== Корзина ===");
        basket.printBasket();
        System.out.println();

        System.out.println("=== Удаление продукта \"Молоко\" ===");
        List<Product> removed = basket.removeProductByName("Молоко");
        System.out.println("Удалённые продукты:");
        for (Product p : removed) {
            System.out.println(p);
        }

        System.out.println("\nСодержимое корзины после удаления:");
        basket.printBasket();
        System.out.println();

        System.out.println("=== Удаление продукта \"Шоколад\" (нет в корзине) ===");
        List<Product> removedNotFound = basket.removeProductByName("Шоколад");
        if (removedNotFound.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Product p : removedNotFound) {
                System.out.println(p);
            }
        }

        System.out.println("\nСодержимое корзины:");
        basket.printBasket();
        System.out.println();

        SearchEngine searchEngine = new SearchEngine();
        searchEngine.add(apple);
        searchEngine.add(banana);
        searchEngine.add(milk);
        searchEngine.add(bread);
        searchEngine.add(cheese);
        searchEngine.add(juice);

        Article article1 = new Article("Польза яблок",
                "Яблоки содержат много витаминов. Яблоко — отличный перекус. Яблоко!");
        Article article2 = new Article("Молочные продукты",
                "Молоко, сыр, йогурт — источники кальция. Молоко полезно детям.");
        Article article3 = new Article("Как выбрать хлеб",
                "Обращайте внимание на состав хлеба и срок годности.");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        System.out.println("=== Поиск по запросу \"яблоко\" ===");
        printResults(searchEngine.search("яблоко"));

        System.out.println("=== Поиск по запросу \"молоко\" ===");
        printResults(searchEngine.search("молоко"));

        System.out.println("=== Поиск по запросу \"хлеб\" ===");
        printResults(searchEngine.search("хлеб"));

        System.out.println("=== Поиск по запросу \"несуществующий\" ===");
        printResults(searchEngine.search("несуществующий"));

        System.out.println("=== Поиск лучшего совпадения ===");
        try {
            Searchable best = searchEngine.findBestMatch("яблоко");
            System.out.println("Лучший результат \"яблоко\": " + best.getStringRepresentation());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Searchable best = searchEngine.findBestMatch("автомобиль");
            System.out.println("Лучший результат \"автомобиль\": " + best.getStringRepresentation());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void printResults(Map<String, Searchable> results) {
        if (results.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            for (Map.Entry<String, Searchable> entry : results.entrySet()) {
                System.out.println(entry.getValue().getStringRepresentation());
            }
        }
        System.out.println();
    }
}