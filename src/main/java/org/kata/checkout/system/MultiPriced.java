package org.kata.checkout.system;

class MultiPriced implements SpecialPrice {
    private final int unitPrice;
    private final int specialCount;
    private final int specialPrice;

    public MultiPriced(int unitPrice, int specialCount, int specialPrice) {
        this.unitPrice = unitPrice;
        this.specialCount = specialCount;
        this.specialPrice = specialPrice;
    }

    @Override
    public int getTotalPrice(int count) {
        int total = 0;
        while (count >= specialCount) {
            total += specialPrice;
            count -= specialCount;
        }
        total += count * unitPrice;
        return total;
    }
}

