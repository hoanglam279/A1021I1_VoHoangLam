package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
  private final IProductService productService = new ProductService();

}
