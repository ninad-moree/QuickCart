package com.ecommerce.quickcart.security.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfig {
    // Every bean should be public, no bean should be private

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
