package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.TypeAccount;

public class CreditCard implements TypeAccount {
    @Override
    public void createType() {
        System.out.println("Created Credit Card");
    }
}
