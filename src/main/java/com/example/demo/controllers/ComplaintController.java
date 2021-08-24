package com.example.demo.controllers;

import com.example.demo.DTO.CreateRequest;
import com.example.demo.models.Complaint;
import com.example.demo.models.OffensesStats;
import com.example.demo.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dataset")
public class ComplaintController {

    private final ComplaintService service;

    @Autowired
    public ComplaintController(final ComplaintService service) {
        this.service = service;
    }


    @GetMapping("/stats/total")
    public ResponseEntity<?> getTotalStats() {
        int total = service.getTotal();
        return new ResponseEntity<>(total, new HttpHeaders(), HttpStatus.OK);
    }



    @GetMapping("/stats/offenses")
    public ResponseEntity<?> getOffensesStats() {
        List<OffensesStats> stats = service.getComplaintsByKY_CD();
        return new ResponseEntity<>(stats, new HttpHeaders(), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteComplaint(@PathVariable Long id) {
        if (service.deleteComplaint(id))
            return new ResponseEntity<>("Deleted successfully!", new HttpHeaders(), HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    @PostMapping
    public ResponseEntity<?> addComplaint(@RequestBody CreateRequest request){
        Complaint newComplaint = service.createComplaint(request);
        if(newComplaint != null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("An unexpected error occurred!", HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
