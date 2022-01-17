package _1_introduce_java.practice;

import java.util.Scanner;

public class FirstEquation {
    public static void main(String[] args) {
        System.out.println("Linear  Equation Resolver");
        System.out.println("Give a equation as 'a*x + b = c' , please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b : ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c : ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - a) / b;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
