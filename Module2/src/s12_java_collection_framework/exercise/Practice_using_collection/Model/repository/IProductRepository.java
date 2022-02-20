package s12_java_collection_framework.exercise.Practice_using_collection.Model.repository;

import s12_java_collection_framework.exercise.Practice_using_collection.Model.model.Product;

import java.util.List;

public interface IProductRepository {
    public List<Product> getAll();
}
