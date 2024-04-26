package org.e01.distributedsql.controller;

import org.e01.distributedsql.entity.Job;
import org.e01.distributedsql.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping()
    public String getJobs() {
        return "jobs";
    }

    @GetMapping("/all")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
}
