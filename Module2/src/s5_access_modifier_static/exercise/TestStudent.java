package s5_access_modifier_static.exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vo Hoang Lam");
        student.setClasses("A0821I1");
        System.out.println(student.toString());
    }
}
