package com.ecommerce.quickcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.quickcart.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
