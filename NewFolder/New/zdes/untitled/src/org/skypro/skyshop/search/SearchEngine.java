package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] items;
    private int size;

    public SearchEngine(int capacity) {
        items = new Searchable[capacity];
        size = 0;
    }

    public void add(Searchable item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Невозможно добавить элемент: место закончилось");
        }
    }

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

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable best = null;
        int bestCount = 0;

        for (int i = 0; i < size; i++) {
            Searchable item = items[i];
            if (item == null) continue;

            int count = countOccurrences(item.getSearchTerm().toLowerCase(), search.toLowerCase());
            if (count > bestCount) {
                bestCount = count;
                best = item;
            }
        }

        if (best == null) {
            throw new BestResultNotFound(search);
        }
        return best;
    }

    private int countOccurrences(String str, String substring) {
        if (substring.isEmpty()) return 0;

        int count = 0;
        int index = 0;
        int foundIndex = str.indexOf(substring, index);
        while (foundIndex != -1) {
            count++;
            index = foundIndex + substring.length();
            foundIndex = str.indexOf(substring, index);
        }
        return count;
    }
}