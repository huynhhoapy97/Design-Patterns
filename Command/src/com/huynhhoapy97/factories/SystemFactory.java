package com.huynhhoapy97.factories;

import com.huynhhoapy97.enums.SystemType;
import com.huynhhoapy97.receivers.System;
import com.huynhhoapy97.receivers.UnixSystem;
import com.huynhhoapy97.receivers.WindowsSystem;

public class SystemFactory {
    private static System system;

    public static System createSystem(SystemType systemType){
        switch (systemType){
            case WINDOWS:
                system = new WindowsSystem();
                break;
            case UNIX:
                system = new UnixSystem();
                break;
        }

        return system;
    }
}
