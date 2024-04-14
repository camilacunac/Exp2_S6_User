package com.example.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
