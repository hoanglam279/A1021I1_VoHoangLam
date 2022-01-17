package _1_introduce_java.exercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD : ");
        usd = sc.nextDouble();
        double quydoi = usd*23000;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
