package com.huynhhoapy97;

import com.huynhhoapy97.adapters.BehaviorAdapter;
import com.huynhhoapy97.classes.MailBehaviorImpl;
import com.huynhhoapy97.classes.Order;
import com.huynhhoapy97.classes.SMSBehaviorImpl;
import com.huynhhoapy97.interfaces.SMSBehavior;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Case without adapter
        /*SMSBehavior smsBehavior = new SMSBehaviorImpl();
        order.complete(smsBehavior);*/

        // Case applied adapter pattern
        SMSBehavior adapterBehavior = new BehaviorAdapter(new MailBehaviorImpl());
        order.complete(adapterBehavior);
    }
}
