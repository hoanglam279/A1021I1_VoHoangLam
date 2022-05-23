package service;

import bean.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void delete(String id);
    List<Product> findAll();
    Product findById(String id);
}
