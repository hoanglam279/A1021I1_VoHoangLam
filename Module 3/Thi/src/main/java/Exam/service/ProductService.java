package Exam.service;

import Exam.model.Product;
import Exam.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();
    public List findAll(){
        return productRepository.findAll();
    }

    public int save(Product product){
        return productRepository.save(product);
    }

    public Product findById(int id){
        return productRepository.findById(id);
    }

    public int delete(int id) {
        return productRepository.delete(id);
    }
}
