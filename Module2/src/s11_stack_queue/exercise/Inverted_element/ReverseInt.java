package s11_stack_queue.exercise.Inverted_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("NHập từng phần tử trong mảng số nguyên: ");
            int num = Integer.parseInt(sc.nextLine());
            array[i] = num;
            stack.push(num);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}
