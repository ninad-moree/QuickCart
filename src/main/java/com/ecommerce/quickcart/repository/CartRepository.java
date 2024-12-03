package com.ecommerce.quickcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.quickcart.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
