package org.e01.distributedsql.controller;

import org.e01.distributedsql.entity.Client;
import org.e01.distributedsql.entity.Worker;
import org.e01.distributedsql.service.ClientService;
import org.e01.distributedsql.service.SuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    private ClientService clientService;
    @Autowired
    private SuperService superService;

    @GetMapping("/clients/all")
    List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/search-by-phone-number")
    Client searchClientByPhoneNumber(@RequestParam("phone_no") String phoneNumber) {
        return clientService.searchClientByPhoneNumber(phoneNumber);
    }



    @GetMapping("/workers/all")
    List<Worker> getAllWorkers() {
        return superService.getAllWorkers();
    }
}
