package s11_stack_queue.exercise.Inverted_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.print("Nhập vào một từ: ");
        String string = sc.nextLine();
        String[] strings = string.split("");
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }
        String newString = "";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stack.pop();
            newString += strings[i];
        }
        System.out.println(newString);
    }
}
