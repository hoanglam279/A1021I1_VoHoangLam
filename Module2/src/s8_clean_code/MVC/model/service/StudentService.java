package s8_clean_code.MVC.model.service;

import s8_clean_code.MVC.model.model.Student;
import s8_clean_code.MVC.model.repository.IStudentRepository;
import s8_clean_code.MVC.model.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập mã học sinh:");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh:");
        String nameStudent = scanner.nextLine();
        System.out.println("Nhập ngày, tháng, năm sinh:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập điểm:");
        int point = Integer.parseInt(scanner.nextLine());

        Student student1 = new Student(codeStudent, nameStudent, dateOfBirth, point);
        iStudentRepository.add(student1);

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student : students) {
            if (student == null) {
                break;
            }
            System.out.println(student);
        }
    }
}
