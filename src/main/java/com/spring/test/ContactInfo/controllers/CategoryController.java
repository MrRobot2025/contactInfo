package com.spring.test.ContactInfo.controllers;

import com.spring.test.ContactInfo.entity.Category;
import com.spring.test.ContactInfo.entity.CustomerQuery;
import com.spring.test.ContactInfo.service.CategoryService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class CategoryController {


    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "/getAllCategory",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> getAllQueries(HttpServletResponse response){
        return categoryService.getAllCategory();
    }
    @PostMapping(path = "/addCategory")
    public ResponseEntity<Category> createQuery(@RequestBody Category category){
        categoryService.save(category);
        return ResponseEntity.ok(category);
    }

}
