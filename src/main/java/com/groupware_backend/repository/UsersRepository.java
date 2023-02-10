package com.groupware_backend.repository;

import com.groupware_backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUserName(String username);

    Boolean existsByUserName(String username);
    Boolean existsByEmail(String email);
}
