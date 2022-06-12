package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    Iterable<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
}