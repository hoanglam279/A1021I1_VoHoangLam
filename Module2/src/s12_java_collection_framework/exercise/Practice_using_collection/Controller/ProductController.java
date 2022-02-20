package s12_java_collection_framework.exercise.Practice_using_collection.Controller;

import s12_java_collection_framework.exercise.Practice_using_collection.Model.model.Product;
import s12_java_collection_framework.exercise.Practice_using_collection.Model.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productService = new ProductService();
        do {
            System.out.println("1. Thêm phần tử\n2. Hiển thị\n3. Sửa phần tử\n4. Xóa phần tử\n5. Tim phan tu\n6. Sắp xếp" +
                    " tăng giảm dần theo giá\n7. Thoát");
            System.out.print("input choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    System.out.print("Mời bạn nhập ID của sản phẩm cần tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    productService.update(id);
                    break;
                case 4:
                    System.out.print("Mời bạn nhập ID của sản phẩm cần tìm: ");
                    int iD = Integer.parseInt(sc.nextLine());
                    productService.delete(iD);
                    break;
                case 5:
                    System.out.print("Mời bạn nhập ten của sản phẩm cần tìm: ");
                    String name = sc.nextLine();
                    List<Product> products = productService.search(name);
                    if (products == null) System.out.println("NOT FOUND");
                    else products.forEach(System.out::println);
                    break;
                case 6:
                    System.out.print("Bạn muốn sắp xếp: \n1. Tăng dần\n2. Giảm dần\nBạn chọn: ");
                    int choiceSort = Integer.parseInt(sc.nextLine());
                    productService.sort(choiceSort);
                    productService.display();
                    break;
                case 7:
                    System.exit(0);
            }

        } while (true);
    }
}
