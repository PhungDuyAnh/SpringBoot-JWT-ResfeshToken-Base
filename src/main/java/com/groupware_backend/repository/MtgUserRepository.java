package com.groupware_backend.repository;

import com.groupware_backend.entity.MtgUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MtgUserRepository extends JpaRepository<MtgUser, Long> {
}
