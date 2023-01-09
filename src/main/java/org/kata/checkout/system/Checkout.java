package org.kata.checkout.system;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
    private Map<String, Integer> prices;
    private Map<String, SpecialPrice> specialPrices;

    public Map<String, Integer> getItems() {
        return items;
    }

    private final Map<String, Integer> items;

    public Checkout() {
        this.prices = new HashMap<>();
        this.specialPrices = new HashMap<>();
        this.items = new HashMap<>();
    }

    public void setPricing(Map<String, Integer> prices,
                           Map<String, SpecialPrice> specialPrices) {
        this.prices = prices;
        this.specialPrices = specialPrices;
    }

    public void scan(String item) {
        int count = items.getOrDefault(item, 0) + 1;
        items.put(item, count);
    }

    public int total() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String item = entry.getKey();
            int count = entry.getValue();
            total += getItemPrice(item, count);
        }
        return total;
    }

    private int getItemPrice(String item, int count) {
        SpecialPrice specialPrice = specialPrices.get(item);
        if (specialPrice != null) {
            return specialPrice.getTotalPrice(count);
        }
        return prices.get(item) * count;
    }
}