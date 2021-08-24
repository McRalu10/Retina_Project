package com.example.demo.repository;

import com.example.demo.models.Complaint;
import com.example.demo.models.OffensesStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint,Long> {
    @Query("SELECT " +
            "    new com.example.demo.models.OffensesStats(v.KY_CD, COUNT(v)) " +
            "FROM " +
            "    Complaint v " +
            "GROUP BY " +
            "    v.KY_CD")
    List<OffensesStats> findComplaintsByKY_CD();
}
