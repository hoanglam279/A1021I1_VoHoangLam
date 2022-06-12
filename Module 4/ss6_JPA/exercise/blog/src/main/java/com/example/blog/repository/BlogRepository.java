package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Integer> {
}