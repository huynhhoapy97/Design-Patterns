package com.huynhhoapy97.models;

public class PizzaCheese extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pizza Cheese");
    }

    @Override
    public void bake() {
        System.out.println("Bake pizza Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cut pizza Cheese");
    }

    @Override
    public void box() {
        System.out.println("Box pizza Cheese");
    }
}

