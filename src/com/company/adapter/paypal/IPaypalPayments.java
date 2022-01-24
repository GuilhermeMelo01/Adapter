package com.company.adapter.paypal;

import com.company.adapter.utils.Token;

public interface IPaypalPayments {

    Token authToken();
    void paypalPayment();
    void payplaReceive();
}
