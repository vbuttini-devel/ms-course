package com.buttini.hrpayroll.services;

import com.buttini.hrpayroll.entities.Payment;
import com.buttini.hrpayroll.entities.Worker;
import com.buttini.hrpayroll.feignclientes.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeignClient.findId(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
