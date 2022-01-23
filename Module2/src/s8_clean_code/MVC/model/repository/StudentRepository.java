package s8_clean_code.MVC.model.repository;

import s8_clean_code.MVC.model.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[20];

    static {
        students[0] = new Student(1, "HaiTT", "1998-01-01", 9);
        students[1] = new Student(1, "TrungDP", "1998-01-01", 9);
        students[2] = new Student(1, "TrungDC", "1998-01-01", 9);
    }

    @Override
    public Student[] getAll() {

        return students;
    }

    @Override
    public void add(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        System.out.println("Danh sách mới sau khi thêm là:");
        for (Student lam : students) {
            if (lam == null) {
                break;
            }
            System.out.println(lam);
        }
    }
}
