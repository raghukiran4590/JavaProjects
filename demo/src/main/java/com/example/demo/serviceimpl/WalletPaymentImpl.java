package com.example.demo.serviceimpl;

import com.example.demo.service.PaymentServiceInterf;
import org.springframework.stereotype.Service;

@Service("WalletPaymentImpl")
public class WalletPaymentImpl implements PaymentServiceInterf {
    @Override
    public void pay(String account, double amount) {

    }
}
