package com.eduardopucinelli.hrpayroll.resources;

import com.eduardopucinelli.hrpayroll.entities.Payment;
import com.eduardopucinelli.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/{workerId}/days/{days}", method = RequestMethod.GET)
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = paymentService.getPayment(workerId, days);

        return ResponseEntity.ok().body(payment);

    }
}
