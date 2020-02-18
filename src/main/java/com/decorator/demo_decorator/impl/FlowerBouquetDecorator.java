package com.decorator.demo_decorator.impl;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {

    protected FlowerBouquet flowerBouquet;

    public FlowerBouquetDecorator(FlowerBouquet flowerBouquet) {
        super("");
        this.flowerBouquet = flowerBouquet;
    }

    protected FlowerBouquet getFlowerBouquet(){
        return this.flowerBouquet;
    }

    public abstract String getDescription();
}
