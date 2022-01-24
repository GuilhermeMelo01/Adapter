package com.company.adapter;

import com.company.adapter.adapters.MercadoPagoAdapter;
import com.company.adapter.adapters.PayoneerAdapter;
import com.company.adapter.mercadopago.MercadoPago;
import com.company.adapter.payoneer.Payoneer;
import com.company.adapter.paypal.IPaypalPayments;

public class Main {

    public static void main(String[] args) {


        IPaypalPayments payments = new PayoneerAdapter(new Payoneer());

        payments.paypalPayment();
        payments.payplaReceive();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-");

        IPaypalPayments payments1 = new MercadoPagoAdapter(new MercadoPago());

        payments1.paypalPayment();
        payments1.payplaReceive();

    }
}
