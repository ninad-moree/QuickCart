package com.ecommerce.quickcart.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.quickcart.exceptions.ResourceNotFoundException;
import com.ecommerce.quickcart.model.Category;
import com.ecommerce.quickcart.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        throw new UnsupportedOperationException("Unimplemented method 'addCategory'");
    }

    @Override
    public Category updaCategory(Category category) {
        throw new UnsupportedOperationException("Unimplemented method 'updaCategory'");
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.findById(id).ifPresentOrElse(
            categoryRepository::delete, 
            () -> {throw new ResourceNotFoundException("Category not found");}
        );
    }
    
}
