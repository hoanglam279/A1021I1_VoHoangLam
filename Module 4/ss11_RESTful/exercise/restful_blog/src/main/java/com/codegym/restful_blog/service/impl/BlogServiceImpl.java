package com.codegym.restful_blog.service.impl;


import com.codegym.restful_blog.model.Blog;
import com.codegym.restful_blog.repository.BlogRepository;
import com.codegym.restful_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAllByCategory(int category_id, Pageable pageable) {
        return blogRepository.findAllByCategory_Id(category_id, pageable);
    }

    @Override
    public Page<Blog> findAllByTitleContaining(String title, Pageable pageable) {
        return blogRepository.findAllByTitleContaining(title, pageable);
    }

    @Override
    public Page<Blog> findAllByTitleContainingAndCategory_Id(String title, int category_id, Pageable pageable) {
        return blogRepository.findAllByTitleContainingAndCategory_Id(title, category_id, pageable);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }
}
