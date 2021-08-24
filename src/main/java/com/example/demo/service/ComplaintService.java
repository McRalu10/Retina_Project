package com.example.demo.service;

import com.example.demo.DTO.CreateRequest;
import com.example.demo.helpers.CSVHelper;
import com.example.demo.mappers.ComplaintMapper;
import com.example.demo.models.Complaint;
import com.example.demo.models.OffensesStats;
import com.example.demo.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintService {

    private final ComplaintRepository repository;

    @Autowired
    public ComplaintService(final ComplaintRepository repository){
        this.repository = repository;
    }

    public int getTotal(){
        return repository.findAll().size();
    }

    public List<OffensesStats> getComplaintsByKY_CD(){
        return repository.findComplaintsByKY_CD();
    }

    public boolean deleteComplaint(Long id){
        Optional<Complaint> complaint = repository.findById(id);
        if (complaint.isPresent()) {
            repository.delete(complaint.get());
            CSVHelper.exportCSV(repository);
            return true;
        } else {
            return false;
        }
    }

    public Complaint createComplaint(CreateRequest request){
        Complaint newComplaint = repository.save(ComplaintMapper.toComplaint(request));
        CSVHelper.exportCSV(repository);
        return newComplaint;
    }

}
