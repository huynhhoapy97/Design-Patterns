package com.huynhhoapy97;

public class BillPughInitialization {
    private BillPughInitialization() {
        System.out.println("Constructor Bill Pugh Initialization");
    }

    public static BillPughInitialization getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final BillPughInitialization instance = new BillPughInitialization();
    }
}
