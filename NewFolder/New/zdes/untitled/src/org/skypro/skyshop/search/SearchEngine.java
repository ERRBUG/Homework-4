package org.skypro.skyshop.search;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {

    private final List<Searchable> items = new ArrayList<>();

    public void add(Searchable item) {
        items.add(item);
    }

    public List<Searchable> search(String query) {
        List<Searchable> results = new ArrayList<>();
        for (Searchable item : items) {
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }


    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable best = null;
        int bestCount = 0;

        for (Searchable item : items) {
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