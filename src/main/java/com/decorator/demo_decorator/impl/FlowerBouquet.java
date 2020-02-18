package com.decorator.demo_decorator.impl;

public abstract class FlowerBouquet {
    protected String description;

    public String getDescription() {
        return description;
    }

    public FlowerBouquet(String description) {
        this.description = description;
    }

    public abstract double cost();
}
