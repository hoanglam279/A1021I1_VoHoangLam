package s12_java_collection_framework.exercise.Practice_using_collection.Model.repository;

import s12_java_collection_framework.exercise.Practice_using_collection.Model.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static List<Product> products = new ArrayList<>();


    @Override
    public List<Product> getAll() {
        return  products;
    }
}
