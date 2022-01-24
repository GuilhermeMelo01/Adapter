package com.company.adapter.payoneer;

import com.company.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
