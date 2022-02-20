package s12_java_collection_framework.exercise.Practice_using_collection.Model.service;

import s12_java_collection_framework.exercise.Practice_using_collection.Model.model.Product;
import s12_java_collection_framework.exercise.Practice_using_collection.Model.repository.ProductRepository;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService implements IProductService {
    static Scanner sc = new Scanner(System.in);
    static ProductRepository productRepository = new ProductRepository();
    static List<Product> products = productRepository.getAll();
    static int count = 0;

    @Override
    public void add() {
        count++;
        inputInformation(0, count);
        System.out.println("Insert successful!");
    }

    @Override
    public void display() {
        products.forEach(System.out::println);

    }

    @Override
    public void update(int id) {
        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                inputInformation(id, count);
                System.out.println("Update successful!");
                break;
            } else {
                check = true;
            }
        }
        if (check) System.out.println("Not found ID");

    }

    @Override
    public void delete(int id) {
        boolean check = true;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Delete sucessfull!");
                check = false;
                break;
            }

        }
        if (check) System.out.println("Not found ID");
    }

    @Override
    public List<Product> search(String name) {
        List<Product> product = null;
        return product = products.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());

    }

    @Override
    public void sort(int choice) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (choice == 1)
                    return (int) o1.getPrice() - (int) o2.getPrice();
                else
                    return (int) o2.getPrice() - (int) o1.getPrice();
            }
        });
    }


    public static void save(Product product, int count) {
        if (product.getId() > 0) {
            int index = products.indexOf(product);
            products.set(index, product);
        } else {
            product.setId(count);
            products.add(product);

        }
    }

    static void inputInformation(int id, int count) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Desciption: ");
        String description = sc.nextLine();
        Product product = new Product(id, name, price, description);
        save(product, count);
    }
}
