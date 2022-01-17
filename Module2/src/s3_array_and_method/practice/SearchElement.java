package s3_array_and_method.practice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        String[] student = {"Vũ", "Tuấn", "Duy", "Lực", "Ly", "Tâm", "Huy", "Lịch"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name's student : ");
        String name = scanner.nextLine();

        boolean check = false;

        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Position of the student in the list " + name + " is : " + (i + 1));
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println("Not found " + name + " in the list");
    }
}
