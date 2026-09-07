package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] items;
    private int size; // количество добавленных элементов

    public SearchEngine(int capacity) {
        items = new Searchable[capacity];
        size = 0;
    }

    // Добавление объекта
    public void add(Searchable item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Невозможно добавить элемент: место закончилось");
        }
    }

    // Поиск: возвращает массив из 5 элементов (или меньше с null)
    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int found = 0;
        for (int i = 0; i < size && found < 5; i++) {
            Searchable item = items[i];
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results[found] = item;
                found++;
            }
        }
        return results;
    }
}