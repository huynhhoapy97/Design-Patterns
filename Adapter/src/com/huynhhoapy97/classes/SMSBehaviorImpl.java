package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.SMSBehavior;

public class SMSBehaviorImpl implements SMSBehavior {
    @Override
    public void send() {
        System.out.println("Sent SMS");
    }
}
