package com.huynhhoapy97;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
        System.out.println("Constructor Eager Initialization");
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
