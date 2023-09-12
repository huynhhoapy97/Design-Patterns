package com.huynhhoapy97;

public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {
        System.out.println("Constructor Lazy Initialization");
    }

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }

        return instance;
    }
}
