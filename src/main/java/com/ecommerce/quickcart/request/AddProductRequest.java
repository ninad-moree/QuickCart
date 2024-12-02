package com.ecommerce.quickcart.request;

import java.math.BigDecimal;

import com.ecommerce.quickcart.model.Category;

import lombok.Data;

// Specifies the request that we want to pass to the function from the frontend

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
