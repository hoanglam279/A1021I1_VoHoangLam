package _1_introduce_java.exercise;

import java.util.Scanner;

public class NumToWord {
    final static String ones[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
    final static String twos[] = {" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

    public static void main(String[] args) {
        System.out.println("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        numberToWord(((num / 100) % 10), " HUNDRED AND");
        numberToWord((num % 100), " ");
    }
    private static void numberToWord(int num, String val) {
        System.out.print(num>19?twos[num/10]+" "+ ones[num%10]:ones[num]);
        System.out.print(num>0?val:"");
    }
}
