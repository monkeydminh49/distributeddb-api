package org.e01.distributedsql.controller;

import org.e01.distributedsql.dto.AssignmentInputDTO;
import org.e01.distributedsql.dto.AssignmentOutputDTO;
import org.e01.distributedsql.entity.Assignment;
import org.e01.distributedsql.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/contracts")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @PostMapping("/create")
    public Map<String, String> createNewContract(@RequestParam("CID") Long clientId) {
        contractService.createNewContract(clientId);
        return Map.of("message", "Contract created successfully");
    }
    @PostMapping("/contracts/{contract-id}/assign-worker")
    public Map<String, String> addAssignmentToContract(@RequestParam("contract-id") Long contractId, AssignmentInputDTO assignmentInputDTO) {
        contractService.addAssignmentToContract(contractId, assignmentInputDTO);
        return Map.of("message", "Assignment added to contract successfully");
    }

    @GetMapping("/contracts/{contract-id}/assignments/all")
    public List<AssignmentOutputDTO> getAllAssignmentsForContract(@RequestParam("contract-id") Long contractId) {
        List<Assignment> assignments = contractService.getAllAssignmentsForContract(contractId);

        List<AssignmentOutputDTO> assignmentOutputDTOs = assignments.stream()
                .map(assignment -> new AssignmentOutputDTO(assignment.getAID(), assignment.getDate(), assignment.getWage(), assignment.getScoreRate(), assignment.getCtID(), assignment.getWID(), assignment.getJID()))
                .toList();

        return assignmentOutputDTOs;
    }

    @PutMapping("/assignments/{assignment-id}/update-score")
    public Map<String, String> updateAssignmentScore(@RequestParam("assignment-id") Long assignmentId, @RequestParam("score") int score) {
        contractService.updateAssignmentScore(assignmentId, score);
        return Map.of("message", "Assignment score updated successfully");
    }
}
