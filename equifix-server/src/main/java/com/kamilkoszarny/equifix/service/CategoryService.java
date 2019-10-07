package com.kamilkoszarny.equifix.service;

import com.kamilkoszarny.equifix.model.Article;
import com.kamilkoszarny.equifix.model.Category;
import com.kamilkoszarny.equifix.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }
}

