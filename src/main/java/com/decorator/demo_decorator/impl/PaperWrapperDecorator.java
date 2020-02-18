package com.decorator.demo_decorator.impl;

public class PaperWrapperDecorator extends FlowerBouquetDecorator {
    public PaperWrapperDecorator(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return this.getFlowerBouquet().getDescription() + " paper";
    }

    @Override
    public double cost() {
        return this.getFlowerBouquet().cost() + 0.5;
    }
}
