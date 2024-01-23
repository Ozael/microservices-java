package com.ozael.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozael.hrpayroll.entities.Payment;
import com.ozael.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{workedDays}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer workedDays) {

        Payment payment = service.getPayment(workerId, workedDays);
        return ResponseEntity.ok(payment);
    }

}
