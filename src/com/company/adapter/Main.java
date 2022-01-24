package com.company.adapter;

import com.company.adapter.adapters.PayoneerAdapter;
import com.company.adapter.payoneer.IPayoneerPayments;
import com.company.adapter.payoneer.Payoneer;
import com.company.adapter.paypal.IPaypalPayments;
import com.company.adapter.paypal.Paypal;

public class Main {

    public static void main(String[] args) {
//        IPaypalPayments payments = new Paypal();
//        payments.paypalPayment();
//        payments.payplaReceive();


        IPaypalPayments payments = new PayoneerAdapter(new Payoneer());

        payments.paypalPayment();
        payments.payplaReceive();

        System.out.println("=-=-=-=-=");
        IPaypalPayments payments1 = new Paypal();

        payments1.paypalPayment();
        payments1.payplaReceive();
    }
}
