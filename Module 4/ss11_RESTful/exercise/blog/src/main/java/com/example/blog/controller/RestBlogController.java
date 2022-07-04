package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.BlogService;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-blog")
public class RestBlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> getListCategory() {
        return categoryService.findAll();
    }
    @GetMapping("")
    public ResponseEntity<Page<Blog>> getList(@RequestParam(defaultValue = "0") int page){
        Page<Blog> blogs = blogService.findAll(PageRequest.of(page,2));
        return new ResponseEntity<>( blogs, HttpStatus.OK);
    }
}
