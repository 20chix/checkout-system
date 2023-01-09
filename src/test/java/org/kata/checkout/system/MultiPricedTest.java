package org.kata.checkout.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiPricedTest {
    @Test
    public void testGetTotalPrice() {
        MultiPriced specialPrice = new MultiPriced(50, 3, 130);

        assertEquals(0, specialPrice.getTotalPrice(0));
        assertEquals(50, specialPrice.getTotalPrice(1));
        assertEquals(100, specialPrice.getTotalPrice(2));
        assertEquals(130, specialPrice.getTotalPrice(3));
        assertEquals(180, specialPrice.getTotalPrice(4));
        assertEquals(230, specialPrice.getTotalPrice(5));
    }
}