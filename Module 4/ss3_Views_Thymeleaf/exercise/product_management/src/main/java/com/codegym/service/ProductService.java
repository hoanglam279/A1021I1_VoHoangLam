package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 11", 5000, "Apple"));
        products.put(2, new Product(2, "SamSung A7", 6000, "SamSung"));
        products.put(3, new Product(3, "Oppo Neo 3", 300, "Oppo"));
        products.put(4, new Product(4, "Iphone 7", 80, "Apple"));
        products.put(5, new Product(5, "Iphone 13", 500, "Apple"));
        products.put(6, new Product(6, "SamSung A8", 900, "SamSung"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
