package com.buttini.hrworker.repositories;

import com.buttini.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vinic
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
