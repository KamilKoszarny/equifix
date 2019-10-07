package com.kamilkoszarny.equifix.controller;

import com.kamilkoszarny.equifix.model.Category;
import com.kamilkoszarny.equifix.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> categories() {
        return categoryService.getAllCategories();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
}

