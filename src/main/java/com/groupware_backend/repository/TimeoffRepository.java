package com.groupware_backend.repository;

import com.groupware_backend.entity.Timeoff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeoffRepository extends JpaRepository<Timeoff, Long> {
}
