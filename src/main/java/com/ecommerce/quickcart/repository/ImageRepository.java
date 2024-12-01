package com.ecommerce.quickcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.quickcart.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    
}
