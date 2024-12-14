package com.example.demo.serviceimpl;

import com.example.demo.service.PaymentServiceInterf;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("CardPaymentImpl")
@Primary
public class CardPaymentImpl implements PaymentServiceInterf {
    @Override
    public void pay(String account, double amount) {

    }
}
