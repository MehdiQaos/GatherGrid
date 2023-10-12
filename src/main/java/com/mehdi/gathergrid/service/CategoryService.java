package com.mehdi.gathergrid.service;

import com.mehdi.gathergrid.repository.CategoryRepository;

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService() {
        categoryRepository = new CategoryRepository();
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }
}
