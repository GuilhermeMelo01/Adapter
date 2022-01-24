package com.company.adapter.adapters;

import com.company.adapter.mercadopago.MercadoPago;
import com.company.adapter.paypal.IPaypalPayments;
import com.company.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("adpatando o payment do Mercado Pago pago com o padrao Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.sendPayment();
    }

    @Override
    public void payplaReceive() {
        mercadoPago.receivePayment();
    }
}
