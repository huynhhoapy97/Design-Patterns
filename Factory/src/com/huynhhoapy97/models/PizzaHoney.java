package com.huynhhoapy97.models;

public class PizzaHoney extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pizza Honey");
    }

    @Override
    public void bake() {
        System.out.println("Bake pizza Honey");
    }

    @Override
    public void cut() {
        System.out.println("Cut pizza Honey");
    }

    @Override
    public void box() {
        System.out.println("Box pizza Honey");
    }
}
