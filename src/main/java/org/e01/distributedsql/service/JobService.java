package org.e01.distributedsql.service;

import org.e01.distributedsql.entity.Job;
import org.e01.distributedsql.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
