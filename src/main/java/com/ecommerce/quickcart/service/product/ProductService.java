package com.ecommerce.quickcart.service.product;

import java.util.List;

import com.ecommerce.quickcart.exceptions.ProductNotFoundException;
import com.ecommerce.quickcart.model.Product;
import com.ecommerce.quickcart.repository.ProductRepository;

public class ProductService implements IProductService {
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id).ifPresentOrElse(
            productRepository::delete, 
            () -> {throw new ProductNotFoundException("Product not found");}
        );
    }

    @Override
    public void updateProduct(Product product, Long productId) {
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category, brand);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return productRepository.findByBrandAndName(brand, name);
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return productRepository.countByBrandAndName(brand, name);
    }

}
