package org.kata.checkout.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CheckoutTest {
    private static Checkout checkout;
    private static Map<String, Integer> prices;
    private Map<String, SpecialPrice> specialPrices;


    @BeforeEach
    public void setUp(){
        prices = new HashMap<>();
        checkout = new Checkout();
        specialPrices = new HashMap<>();

        prices.put("A", 50);
        prices.put("B", 75);
        prices.put("C", 25);
        prices.put("D", 150);
        prices.put("E", 200);
    }

    @Test
    void testCalculateTotal_noSpecialPrices() {
        checkout.setPricing(prices, specialPrices);
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("C");
        checkout.scan("D");
        checkout.scan("E");

        assertEquals(checkout.total(), 500);
    }

    @Test
    public void testCalculateTotal_multiPrice() {
        specialPrices.put("A", new MultiPriced(50, 3, 130));
        specialPrices.put("B", new MultiPriced(75, 2, 125));

        checkout.setPricing(prices, specialPrices);
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("B");

        assertEquals(255, checkout.total());
    }
}