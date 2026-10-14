package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    public Product(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Название продукта не может быть пустой строкой, null или состоять только из пробелов");
        }
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
        return name;
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