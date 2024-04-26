package org.e01.distributedsql.repository;

import org.e01.distributedsql.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
