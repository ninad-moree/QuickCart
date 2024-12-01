package com.ecommerce.quickcart.dto;

import lombok.Data;

// Used to structure what we have to return in the function for the frontend

@Data
public class ImageDto {
    private Long imageId;
    private String imageName;
    private String downloadUrl;
}
