package com.decorator.demo_decorator.impl;

public class GlitterDecorator extends FlowerBouquetDecorator {
    public GlitterDecorator(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + " glitter ";
    }

    @Override
    public double cost() {
        return this.getFlowerBouquet().cost() + 0.25;
    }
}
