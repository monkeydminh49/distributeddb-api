package org.e01.distributedsql.service;

import org.e01.distributedsql.entity.Worker;
import org.e01.distributedsql.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperService {
    @Autowired
    private WorkerRepository workerRepository;
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }
}
