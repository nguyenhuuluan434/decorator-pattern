package com.decorator.demo_decorator.impl;

public class RibbonBowDecorator extends FlowerBouquetDecorator {
    public RibbonBowDecorator(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return this.getFlowerBouquet().getDescription() + " RibbonBow";
    }

    @Override
    public double cost() {
        return this.getFlowerBouquet().cost() + 0.75;
    }
}

