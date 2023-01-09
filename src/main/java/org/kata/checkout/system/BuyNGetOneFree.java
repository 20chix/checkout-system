package org.kata.checkout.system;

class BuyNGetOneFree implements SpecialPrice {
    private final int unitPrice;
    private final int specialCount;

    public BuyNGetOneFree(int unitPrice, int specialCount) {
        this.unitPrice = unitPrice;
        this.specialCount = specialCount;
    }

    @Override
    public int getTotalPrice(int count) {
        return unitPrice * (count - count / specialCount);
    }
}
