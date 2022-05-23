package service;

import bean.Product;
import repository.ProductRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository= new ProductRepository();

    @Override
    public void create(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Product> findAll() {
      return   productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return null;
    }
}
