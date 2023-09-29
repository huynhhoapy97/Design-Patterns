package com.huynhhoapy97.adapters;

import com.huynhhoapy97.interfaces.MailBehavior;
import com.huynhhoapy97.interfaces.SMSBehavior;

public class BehaviorAdapter implements SMSBehavior {
    MailBehavior mailBehavior;

    public BehaviorAdapter(MailBehavior mailBehavior) {
        this.mailBehavior = mailBehavior;
    }

    @Override
    public void send() {
        mailBehavior.send();
    }
}
