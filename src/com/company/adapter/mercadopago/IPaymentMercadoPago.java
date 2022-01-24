package com.company.adapter.mercadopago;

import com.company.adapter.utils.Token;

public interface IPaymentMercadoPago {

    Token token();
    void sendPayment();
    void receivePayment();
}
