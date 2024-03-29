package com.buttini.hrpayroll.resources;

import com.buttini.hrpayroll.entities.Payment;
import com.buttini.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value="/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId,@PathVariable Integer days) {
        return ResponseEntity.ok().body(paymentService.getPayment(workerId, days));
    }

}
