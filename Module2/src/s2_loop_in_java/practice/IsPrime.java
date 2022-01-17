package s2_loop_in_java.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2)
            check = false;
        else {
            for(int i = 2;i < num; i++) {
                if(num % i == 0) {
                    check = false;
                }
            }
        }
        if(check)
            System.out.println(num + " is a prime");
        else
            System.out.println(num + " is not a prime");
    }
}
