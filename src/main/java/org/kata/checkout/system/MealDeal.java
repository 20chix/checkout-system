package org.kata.checkout.system;

import java.util.Map;

public class MealDeal implements SpecialPrice {
    private final Map<String, Integer> prices;
    private final Map<String, Integer> specialPrices;
    private final Map<String, Integer> items;

    public MealDeal(Map<String, Integer> prices,
                    Map<String, Integer> specialPrices,
                    Map<String, Integer> items) {
        this.prices = prices;
        this.specialPrices = specialPrices;
        this.items = items;
    }

    @Override
    public int getTotalPrice(int count) {
        int total = 0;
        for (Map.Entry<String, Integer> entry : specialPrices.entrySet()) {
            String item = entry.getKey();
            int itemCount = items.getOrDefault(item, 0);
            if (itemCount > 0) {
                total += entry.getValue();
                items.put(item, itemCount - 1);
            } else {
                total += prices.get(item) * itemCount;
            }
        }
        return total;
    }
}
