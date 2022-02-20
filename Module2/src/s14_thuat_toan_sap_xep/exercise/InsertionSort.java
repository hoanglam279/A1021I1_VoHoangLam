package s14_thuat_toan_sap_xep.exercise;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j -= 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list : ");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\n List after sort : ");
        insertionSort(list);
        for (int j : list) {
            System.out.print(j + "\t");
        }
    }
}
