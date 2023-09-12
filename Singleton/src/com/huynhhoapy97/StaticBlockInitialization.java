package com.huynhhoapy97;

public class StaticBlockInitialization {
    private static final StaticBlockInitialization instance;

    private StaticBlockInitialization() {
        System.out.println("Constructor Static Block Initialization");
    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception raised when creating the singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
