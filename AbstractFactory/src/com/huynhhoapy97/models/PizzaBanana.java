package com.huynhhoapy97.models;

public class PizzaBanana extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pizza Banana");
    }

    @Override
    public void bake() {
        System.out.println("Bake pizza Banana");
    }

    @Override
    public void cut() {
        System.out.println("Cut pizza Banana");
    }

    @Override
    public void box() {
        System.out.println("Box pizza Banana");
    }
}
