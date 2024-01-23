package com.ozael.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.ozael.hrpayroll.entities.Payment;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int workedDays) {
        return new Payment("Bob", 200.00, workedDays);
    }
}
