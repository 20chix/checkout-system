package org.kata.checkout.system;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MealDealTest {
    @Test
    public void testGetTotalPrice() {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("D", 150);
        prices.put("E", 200);

        Map<String, Integer> specialPrices = new HashMap<>();
        specialPrices.put("D", 100);
        specialPrices.put("E", 100);

        Map<String, Integer> items = new HashMap<>();
        items.put("D", 2);
        items.put("E", 2);

        MealDeal specialPrice = new MealDeal(prices, specialPrices, items);
        assertEquals(200, specialPrice.getTotalPrice(2));
    }
}