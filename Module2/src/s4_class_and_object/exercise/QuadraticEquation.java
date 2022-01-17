package s4_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / 2;
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / 2;
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("The Equation has 2 root : R1 =" + quadraticEquation.getRoot1() + " R2= " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The Equation has 1 root : R1 =" + quadraticEquation.getRoot1());
        } else {
            System.out.println("The Equation has no root");
        }
    }
}
