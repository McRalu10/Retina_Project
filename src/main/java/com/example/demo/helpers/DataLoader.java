package com.example.demo.helpers;

import com.example.demo.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final ComplaintRepository repository;

    @Autowired
    public DataLoader(ComplaintRepository repository) {
        this.repository = repository;
    }

    public void run(ApplicationArguments args) {
        CSVHelper.getSampleData(repository);
    }
}