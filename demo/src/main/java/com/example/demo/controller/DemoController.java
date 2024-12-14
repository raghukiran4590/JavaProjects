package com.example.demo.controller;

import com.example.demo.models.Demo;
import com.example.demo.service.PaymentServiceInterf;
import com.example.demo.serviceimpl.CardPaymentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class DemoController {
//    First way of dependency Injection - by autowired - Field Injection
//    @Autowired
//    Demo demoBySpring;

    private Demo demoBySpring;

    // Second way of dependency injection - by constructor - constructor injection
    public DemoController(Demo demoBySpring) {
        System.out.println("In DemoController constructor:" + demoBySpring);
        this.demoBySpring = demoBySpring;
        System.out.println("demoController object:" + this);
        System.out.println("demo object:" + this.demoBySpring);
    }

    @Autowired
    @Qualifier("getTemplate")
    RestTemplate restTemplate;

    @Autowired
    @Qualifier("WalletPaymentImpl")
    PaymentServiceInterf walletType;

    @Autowired
    @Qualifier("CardPaymentImpl")
    PaymentServiceInterf cardTypeWithQualifier;


    @Autowired
    PaymentServiceInterf cardType;

    @Autowired
    CardPaymentImpl cardPayment;


    @GetMapping("/demo")
    public String printHelloWorld() {
        System.out.println(this);
        return "Hello World!";
    }

    @GetMapping("/demo-obj")
    public void printDemoObject() {
        System.out.println(demoBySpring);
    }
}
