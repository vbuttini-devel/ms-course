package com.buttini.hrworker.resources;

import com.buttini.hrworker.entities.Worker;
import com.buttini.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/worker")
public class WorkerResource {

    private final WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok().body(
                workerRepository.findAll()
        );
    }

    @GetMapping("/id")
    public ResponseEntity<Worker> findId(@PathVariable Long id){
        return ResponseEntity.ok().body(
                workerRepository.findById(id)
                        .orElseThrow(()-> new RuntimeException("Worker not found"))
        );
    }

}
