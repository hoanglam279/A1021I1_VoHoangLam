package com.example.demorestapi.Service;

import com.example.demorestapi.Model.Category;
import com.example.demorestapi.Repository.CategoryRepository;
import com.example.demorestapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
