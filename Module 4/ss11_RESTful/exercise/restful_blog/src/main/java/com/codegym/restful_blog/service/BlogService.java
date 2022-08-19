package com.codegym.restful_blog.service;

import com.codegym.restful_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();

    Page<Blog> findAllByCategory(int category_id, Pageable pageable);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    Page<Blog> findAllByTitleContainingAndCategory_Id(String title, int category_id, Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);

}
