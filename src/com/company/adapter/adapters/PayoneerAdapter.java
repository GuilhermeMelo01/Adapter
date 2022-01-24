package com.company.adapter.adapters;

import com.company.adapter.payoneer.Payoneer;
import com.company.adapter.paypal.IPaypalPayments;
import com.company.adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os metodos padrao do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void payplaReceive() {
        this.payoneer.receivePayment();
    }
}
