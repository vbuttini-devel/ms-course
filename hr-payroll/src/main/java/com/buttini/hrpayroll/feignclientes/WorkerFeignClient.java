package com.buttini.hrpayroll.feignclientes;

import com.buttini.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/worker")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    ResponseEntity<Worker> findId(@PathVariable Long id);

}
