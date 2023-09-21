package com.huynhhoapy97.models;

public class PizzaCorn extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pizza Corn");
    }

    @Override
    public void bake() {
        System.out.println("Bake pizza Corn");
    }

    @Override
    public void cut() {
        System.out.println("Cut pizza Corn");
    }

    @Override
    public void box() {
        System.out.println("Box pizza Corn");
    }
}
