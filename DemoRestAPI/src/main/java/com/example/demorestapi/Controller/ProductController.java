package com.example.demorestapi.Controller;

import com.example.demorestapi.Model.Category;
import com.example.demorestapi.Model.Product;
import com.example.demorestapi.Service.CategoryService;
import com.example.demorestapi.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "thanh cong";
    }

    /*@GetMapping("/products/add")
    public String showAddProductForm(Model model) {
        List<Category> categories = productService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/products")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product != null) {
            List<Category> categories = productService.getAllCategories();
            model.addAttribute("categories", categories);
            model.addAttribute("product", product);
            return "product-edit";
        } else {
            return "redirect:/products";
        }
    }

    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable("id") Long id, @ModelAttribute("product") Product product) {
        product.setId(id);
        productService.saveProduct(product);
        return "redirect:/products";
    }*/
}

