package com.company.adapter.paypal;

import com.company.adapter.utils.Token;

public class Paypal implements IPaypalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via Paypal");
    }

    @Override
    public void payplaReceive() {
        System.out.println("Recebendo pagamentos via Paypal");
    }
}
