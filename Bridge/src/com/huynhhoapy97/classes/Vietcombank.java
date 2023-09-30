package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.TypeAccount;

public class Vietcombank extends Bank{
    public Vietcombank(TypeAccount typeAccount) {
        super(typeAccount);
    }

    @Override
    public void openAccount() {
        System.out.println("You are creating bank account with type account:");
        this.typeAccount.createType();
    }
}
