package com.ecommerce.quickcart.dto;

import java.math.BigDecimal;
import java.util.Set;

import lombok.Data;

@Data
public class CartDto {
    private Long cartId;
    private Set<CartItemDto> cartItems;
    private BigDecimal totalAmount;
}
