package org.e01.distributedsql.service;

import org.e01.distributedsql.entity.Client;
import org.e01.distributedsql.exception.NotFoundException;
import org.e01.distributedsql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client searchClientByPhoneNumber(String phoneNumber) {
        return clientRepository.findByPhoneNo(phoneNumber).orElseThrow(() -> new NotFoundException("Client not found"));
    }
}
