package com.ecommerce.quickcart.service.product;

import java.util.List;

import com.ecommerce.quickcart.model.Product;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductByBrand(String brand);

    List<Product> getProductByCategoryAndBrand(String category, String brand);

    List<Product> getProductByName(String name);

    List<Product> getProductsByBrandAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
