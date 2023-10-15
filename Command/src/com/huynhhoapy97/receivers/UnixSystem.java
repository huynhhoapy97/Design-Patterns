package com.huynhhoapy97.receivers;

public class UnixSystem implements System {
    @Override
    public void open() {
        java.lang.System.out.println("Open file in Unix OS");
    }

    @Override
    public void close() {
        java.lang.System.out.println("Close file in Unix OS");
    }
}
