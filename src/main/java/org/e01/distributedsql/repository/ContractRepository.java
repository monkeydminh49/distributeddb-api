package org.e01.distributedsql.repository;

import org.e01.distributedsql.entity.Assignment;
import org.e01.distributedsql.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    @Modifying
    @Query(value = "EXECUTE createContract @CID = :clientId, @ID = NULL;", nativeQuery = true)
    void createNewContract(Long clientId);

    @Modifying
    @Query(value = "EXECUTE addAssignmentToContract @CID = :contractId, @JID = :jobId, @WID = :workerId, @DATE = :date;", nativeQuery = true)
    void addAssignmentToContract(Long contractId, Long jobId, Long workerId, LocalDateTime date);

    @Modifying
    @Query(value = "EXECUTE updateAssignmentScore @AID = :assignmentId, @SCORE = :score;", nativeQuery = true)
    void updateAssignmentScore(Long assignmentId, int score);
    
}
