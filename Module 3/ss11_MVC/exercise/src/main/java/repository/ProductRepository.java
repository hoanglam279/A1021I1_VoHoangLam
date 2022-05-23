package repository;

import bean.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductRepository {
    public List<Product> findAll() {
        List<Product> res = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lam", "root", "270900");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double price = resultSet.getDouble(3);
                String brand = resultSet.getString(4);
                int quantity = resultSet.getInt(5);
                Date dateRelease = resultSet.getDate(6);
                Product product = new Product(id, name, brand, price, quantity, dateRelease);
                res.add(product);
            }
        } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
        }

        return res;
    }
}
