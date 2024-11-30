package com.ecommerce.quickcart.service.product;

import java.util.List;

import com.ecommerce.quickcart.model.Product;
import com.ecommerce.quickcart.request.AddProductRequest;
import com.ecommerce.quickcart.request.UpdateProductRequest;

public interface IProductService {
    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(UpdateProductRequest request, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductByBrand(String brand);

    List<Product> getProductByCategoryAndBrand(String category, String brand);

    List<Product> getProductByName(String name);

    List<Product> getProductsByBrandAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
