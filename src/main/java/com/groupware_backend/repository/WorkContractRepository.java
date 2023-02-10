package com.groupware_backend.repository;

import com.groupware_backend.entity.WorkContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkContractRepository extends JpaRepository<WorkContract, Long> {
}
