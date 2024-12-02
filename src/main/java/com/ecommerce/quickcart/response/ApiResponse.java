package com.ecommerce.quickcart.response;

import lombok.AllArgsConstructor;
import lombok.Data;

// Specifies the respose thats is returned to the frontend from the APIs 

@Data
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private Object data;
}
