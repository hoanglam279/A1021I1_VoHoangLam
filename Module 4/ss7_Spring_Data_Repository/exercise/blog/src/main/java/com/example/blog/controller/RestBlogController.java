package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.BlogService;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.List;

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
    public ResponseEntity<Page<Blog>> getList(@RequestParam(defaultValue = "0") int page) {
        Page<Blog> blogs = blogService.findAll(PageRequest.of(page, 2));
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<Void> createCustomer(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        if (blog.getId() == 0) {
            blog.setCreatedTime(LocalDate.now());
        }
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/{id}/view")
    public ResponseEntity<Blog> view(@PathVariable("id") int id) {
        System.out.println("Fetching Blog with id " + id);
        Blog customer = blogService.findById(id);
        if (customer == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Blog> deleteCustomer(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting Blog with id " + id);

        Blog customer = blogService.findById(id);
        if (customer == null) {
            System.out.println("Unable to delete. Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}/edit")
    public ResponseEntity<Blog> updateCustomer(@PathVariable("id") int id, @RequestBody Blog blog) {
        System.out.println("Updating Blog " + id);

        Blog currentBlog = blogService.findById(id);

        if (currentBlog == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        currentBlog.setTitle(blog.getTitle());
        currentBlog.setContent(blog.getContent());
        currentBlog.setAuthor(blog.getAuthor());
        currentBlog.setCategory(blog.getCategory());
        currentBlog.setCreatedTime(blog.getCreatedTime());
        currentBlog.setId(blog.getId());
        blogService.save(currentBlog);
        return new ResponseEntity<Blog>(currentBlog, HttpStatus.OK);
    }

}
