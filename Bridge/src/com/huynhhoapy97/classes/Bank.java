package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.TypeAccount;

public abstract class Bank {
    protected String number;
    protected String fullName;
    protected TypeAccount typeAccount;

    public Bank(TypeAccount typeAccount){
        this.typeAccount = typeAccount;
    }

    public abstract void openAccount();
}
