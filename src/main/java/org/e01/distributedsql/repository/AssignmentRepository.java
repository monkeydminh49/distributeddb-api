package org.e01.distributedsql.repository;

import org.e01.distributedsql.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    @Query("SELECT a FROM Assignment a WHERE a.CtID = :contractId")
    List<Assignment> findAllByCtID(Long contractId);
}
