package org.skypro.skyshop.search;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchEngine {
    private final Set<Searchable> items = new HashSet<>();

    public void add(Searchable item) {
        items.add(item);
    }

    public Set<Searchable> search(String query) {
        Set<Searchable> results = new TreeSet<>(new SearchableComparator());
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

    private static class SearchableComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable s1, Searchable s2) {
            int lenCompare = Integer.compare(
                    s2.getSearchableName().length(),
                    s1.getSearchableName().length()
            );
            if (lenCompare != 0) {
                return lenCompare;
            }
            return s1.getSearchableName().compareTo(s2.getSearchableName());
        }
    }
}