package com.company.adapter.mercadopago;

import com.company.adapter.utils.Token;

public class MercadoPago implements IPaymentMercadoPago{
    @Override
    public Token token() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamento via Mercado Pago");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Mercado Pago");
    }
}
