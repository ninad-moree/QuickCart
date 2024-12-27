package com.ecommerce.quickcart.dto;

import java.util.Collection;
import java.util.List;

import com.ecommerce.quickcart.model.Role;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
    private Collection<Role> roles;
}
