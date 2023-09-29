package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.MailBehavior;

public class MailBehaviorImpl implements MailBehavior {
    @Override
    public void send() {
        System.out.println("Sent mail");
    }
}
