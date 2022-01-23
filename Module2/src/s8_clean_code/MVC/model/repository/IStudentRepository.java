package s8_clean_code.MVC.model.repository;

import s8_clean_code.MVC.model.model.Student;

public interface IStudentRepository {
    Student[] getAll();
    void add(Student student);
}
