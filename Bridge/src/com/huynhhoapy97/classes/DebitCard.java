package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.TypeAccount;

public class DebitCard implements TypeAccount {
    @Override
    public void createType() {
        System.out.println("Created Debit Card");
    }
}
