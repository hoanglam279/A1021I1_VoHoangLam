package s8_clean_code.MVC.controller;

import s8_clean_code.MVC.model.service.IStudentService;
import s8_clean_code.MVC.model.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        IStudentService iStudentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với chương trình quản lí học sinh");
        System.out.println("Mời bạn chọn chức năng thực hiện :");
        System.out.println("1. Hiển thị danh sách học sinh: ");
        System.out.println("2. Thêm mới học sinh: ");
        System.out.println("3. Xóa học sinh: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                iStudentService.display();
                break;
            case 2:
                iStudentService.add();
                break;
            case 3:
                iStudentService.delete();
                break;
        }
    }
}
