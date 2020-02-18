package com.decorator.demo_decorator.impl;

public class RoseBouquet extends FlowerBouquet {
    public RoseBouquet() {
        super("Rose bouquet");
    }

    @Override
    public double cost() {
        return 1;
    }
}
