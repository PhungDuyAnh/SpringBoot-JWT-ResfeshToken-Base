package com.groupware_backend.repository;

import com.groupware_backend.entity.ChildTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildTaskRepository extends JpaRepository<ChildTask, Long> {
}
