package com.example.blog.service;

import com.example.blog.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}