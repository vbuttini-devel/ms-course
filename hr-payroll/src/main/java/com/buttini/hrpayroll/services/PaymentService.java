package com.buttini.hrpayroll.services;

import com.buttini.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long WorkerId, Integer days) {
        return new Payment("Worker", 100.0, days);
    }

}
