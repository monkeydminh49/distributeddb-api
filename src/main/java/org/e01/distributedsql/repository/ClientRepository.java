package org.e01.distributedsql.repository;

import org.e01.distributedsql.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByPhoneNo(String phoneNumber);
}
