package s11_stack_queue.exercise.optional.CheckBracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void checkBracket(String string) {
        String[] strings = string.split("");
        Stack<String> stackBracket = new Stack<>();
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("(")) {
                stackBracket.add(strings[i]);
            } else if (strings[i].equals(")")) {
                if (stackBracket.isEmpty()) {
                    System.out.println("Khong hop le!");
                } else {
                    count++;
                }
            }
        }
        if (count == stackBracket.size()) {
            System.out.println("hop le");
        } else if (stackBracket.isEmpty()) {
            System.out.println("khong hop le");
        } else {
            System.out.println("khong hop le");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra: ");
        String string = sc.nextLine();
        checkBracket(string);
    }
}
