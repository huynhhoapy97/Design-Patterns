package com.huynhhoapy97;

import com.huynhhoapy97.facade.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade
                .getInstance()
                .buyProductByCashWithStandardShipping("huynhhoapy97@gmail.com", "0123456789");

        System.out.println("----------------------------------------------");

        OrderFacade
                .getInstance()
                .buyProductByEbankingWithFreeShipping("huynhhoapy97@gmail.com");
    }
}
