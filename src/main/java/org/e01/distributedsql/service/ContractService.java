package org.e01.distributedsql.service;

import org.e01.distributedsql.dto.AssignmentInputDTO;
import org.e01.distributedsql.entity.Assignment;
import org.e01.distributedsql.repository.AssignmentRepository;
import org.e01.distributedsql.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private AssignmentRepository assignmentRepository;

    @Transactional
    public void createNewContract(Long clientId) {
        contractRepository.createNewContract(clientId);
    }

    @Transactional
    public void addAssignmentToContract(Long contractId, AssignmentInputDTO assignmentInputDTO) {

        contractRepository.addAssignmentToContract(contractId, assignmentInputDTO.getJID(), assignmentInputDTO.getWID(), assignmentInputDTO.getDate());
    }


    public void updateAssignmentScore(Long assignmentId, int score) {
        contractRepository.updateAssignmentScore(assignmentId, score);
    }

    public List<Assignment> getAllAssignmentsForContract(Long contractId) {
        return assignmentRepository.findAllByCtID(contractId);
    }
}
