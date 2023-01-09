package org.kata.checkout.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyNGetOneFreeTest {
    @Test
    public void testGetTotalPrice() {
        BuyNGetOneFree specialPrice = new BuyNGetOneFree(50, 3);

        assertEquals(0, specialPrice.getTotalPrice(0));
        assertEquals(50, specialPrice.getTotalPrice(1));
        assertEquals(100, specialPrice.getTotalPrice(2));
        assertEquals(100, specialPrice.getTotalPrice(3));
        assertEquals(150, specialPrice.getTotalPrice(4));
        assertEquals(200, specialPrice.getTotalPrice(5));
    }

}