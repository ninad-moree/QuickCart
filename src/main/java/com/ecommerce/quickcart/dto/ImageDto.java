package com.ecommerce.quickcart.dto;

import lombok.Data;

// Used to structure what we have to return in the function in ImageService File

@Data
public class ImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;
}
