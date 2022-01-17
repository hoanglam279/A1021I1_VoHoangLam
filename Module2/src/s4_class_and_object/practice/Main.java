package s4_class_and_object.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println("Your rectangle: \n " + rect.display());
        System.out.println("Perimeter off the rectangle : " + rect.getPerimeter());
        System.out.println("Area off the rectangle : " + rect.getArea());
    }
}
