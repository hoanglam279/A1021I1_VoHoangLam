package s12_java_collection_framework.exercise.Practice_using_collection.Model.service;

import s12_java_collection_framework.exercise.Practice_using_collection.Model.model.Product;

import java.util.List;

public interface IProductService {
    void add();
    void display();
    void update(int id);
    void delete(int id);
    List<Product> search(String name);
    void sort(int choice);
}
