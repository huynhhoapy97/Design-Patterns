package com.huynhhoapy97.facade;

import com.huynhhoapy97.subsystems.*;

public class OrderFacade {
    private static final OrderFacade instance = new OrderFacade();

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private MailService mailService;
    private SmsService smsService;

    private OrderFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        mailService = new MailService();
        smsService = new SmsService();
    }

    public static OrderFacade getInstance() {
        return instance;
    }

    public void buyProductByCashWithStandardShipping(String email, String phoneNumber) {
        accountService.getAccountByEmail(email);
        paymentService.paymentByCash();
        shippingService.standardShipping();
        mailService.send(email);
        smsService.send(phoneNumber);
    }

    public void buyProductByEbankingWithFreeShipping(String email) {
        accountService.getAccountByEmail(email);
        paymentService.paymentByEbanking();
        shippingService.freeShipping();
        mailService.send(email);
    }
}
