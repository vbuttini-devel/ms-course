package com.buttini.hrpayroll.services;

import com.buttini.hrpayroll.entities.Payment;
import com.buttini.hrpayroll.entities.Worker;
import com.buttini.hrpayroll.feignclientes.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeignClient.findId(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
