package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 499; // фиксированная цена (пример)

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true; // товар с фиксированной ценой – специальный
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIX_PRICE;
    }
}