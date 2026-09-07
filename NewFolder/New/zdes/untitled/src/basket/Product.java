package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String getSearchTerm() {
        return name; // ищем по имени товара
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getSearchableName() {
        return name;
    }

    @Override
    public abstract String toString();
}