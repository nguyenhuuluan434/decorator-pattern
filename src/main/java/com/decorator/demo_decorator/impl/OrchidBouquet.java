package com.decorator.demo_decorator.impl;

public class OrchidBouquet extends FlowerBouquet {
    public OrchidBouquet() {
        super("Orchid Bouquet");
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
