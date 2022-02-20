package s14_thuat_toan_sap_xep.exercise;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSortByStep(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int valueInsert = array[i];
            int indexInsert = i;
            while (indexInsert > 0 && array[indexInsert - 1] > valueInsert) {
                array[indexInsert] = array[indexInsert - 1];
                indexInsert--;
                System.out.println("Di chuyen phan tu " + array[indexInsert]);
            }
            if (indexInsert != i) {
                System.out.println("Chen phan tu : " + valueInsert + " tai vi tri " + indexInsert);
                array[indexInsert] = valueInsert;
            }
            System.out.println("Vong lap thu " + i);
            for (int j : array) {
                System.out.print(j + "\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao do dai List");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhap vao " + array.length + " phan tu voi gia tri : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang ban da nhap : ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.print("\n Bat dau sap xep chen : ");
        insertionSortByStep(array);
    }
}
