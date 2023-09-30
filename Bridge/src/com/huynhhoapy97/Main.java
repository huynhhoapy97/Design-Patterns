package com.huynhhoapy97;

import com.huynhhoapy97.classes.*;

public class Main {
    public static void main(String[] args) {
        Bank vietcombank = new Vietcombank(new CreditCard());
        vietcombank.openAccount();

        Bank agribank = new Agribank(new DebitCard());
        agribank.openAccount();
    }
}
