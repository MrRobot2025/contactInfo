package com.spring.test.ContactInfo.service;

import com.spring.test.ContactInfo.entity.Category;
import com.spring.test.ContactInfo.entity.CustomerQuery;
import com.spring.test.ContactInfo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ResponseEntity<List<Category>> getAllCategory(){
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    public void save(Category category){
        category.setId(UUID.randomUUID().toString().split("-")[0]);
        categoryRepository.save(category);
    }
}
