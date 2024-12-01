package com.ecommerce.quickcart.service.category;

import java.util.List;

import com.ecommerce.quickcart.model.Category;

public interface ICategoryService {
    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

    Category addCategory(Category category);

    Category updaCategory(Category category, Long id);

    void deleteCategoryById(Long id);
}
