package com.huynhhoapy97.receivers;

public class WindowsSystem implements System {
    @Override
    public void open() {
        java.lang.System.out.println("Open file in Windows OS");
    }

    @Override
    public void close() {
        java.lang.System.out.println("Close file in Windows OS");
    }
}
