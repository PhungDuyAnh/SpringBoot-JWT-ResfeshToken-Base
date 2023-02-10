package com.groupware_backend.repository;

import com.groupware_backend.entity.StatusTimeOff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTimeOffRepository extends JpaRepository<StatusTimeOff, Long> {
}
