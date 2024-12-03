package com.ecommerce.quickcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.quickcart.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
