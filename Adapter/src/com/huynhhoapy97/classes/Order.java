package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.SMSBehavior;

public class Order {
    public void complete(SMSBehavior smsBehavior){
        System.out.println("--------- Order completed ---------");
        smsBehavior.send();
    }
}
