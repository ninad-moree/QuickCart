package com.ecommerce.quickcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.quickcart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
