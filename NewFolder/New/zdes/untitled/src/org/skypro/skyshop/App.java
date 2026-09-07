package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

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


        SearchEngine searchEngine = new SearchEngine(10);

        searchEngine.add(apple);
        searchEngine.add(banana);
        searchEngine.add(milk);
        searchEngine.add(bread);
        searchEngine.add(cheese);
        searchEngine.add(juice);

        Article article1 = new Article("Польза яблок", "Яблоки содержат много витаминов и клетчатки.");
        Article article2 = new Article("Молочные продукты", "Молоко, сыр, йогурт — источники кальция.");
        Article article3 = new Article("Как выбрать хлеб", "Обращайте внимание на состав и срок годности.");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        System.out.println("=== Поиск по запросу 'яблоко' ===");
        printSearchResults(searchEngine.search("яблоко"));

        System.out.println("=== Поиск по запросу 'молоко' ===");
        printSearchResults(searchEngine.search("молоко"));

        System.out.println("=== Поиск по запросу 'хлеб' ===");
        printSearchResults(searchEngine.search("хлеб"));

        System.out.println("=== Поиск по запросу 'сыр' ===");
        printSearchResults(searchEngine.search("сыр"));

        System.out.println("=== Поиск по запросу 'витамины' ===");
        printSearchResults(searchEngine.search("витамины"));

        System.out.println("=== Поиск по запросу 'несуществующий' ===");
        printSearchResults(searchEngine.search("несуществующий"));
    }

    private static void printSearchResults(Searchable[] results) {
        for (Searchable item : results) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }
        System.out.println();
    }
}