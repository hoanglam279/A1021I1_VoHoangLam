package s11_stack_queue.exercise.optional.convert_decimal_binary;

import java.util.List;
import java.util.Scanner;

public class ExchangController {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1.Chuyển từ thập phân sang nhị phân\n2.Chuyển từ nhị phân sang thập phân\n" +
                    "3.Chuyển từ thập phân sang thập lục phân\n4.Thoát\nMoi bạn chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Mời bạn nhập số hệ thập phân: ");
                    int numberDecimal = Integer.parseInt(sc.nextLine());
                    List result = exchange.exchangeBinary(numberDecimal);
                    System.out.print("Mã thập phân " + numberDecimal + " chuyển thành mã nhị phân: ");
                    result.forEach(System.out::print);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nhập mã nhị phân cần chuyển: ");
                    String numberBinary = sc.nextLine();
                    String[] number = numberBinary.split("");
                    int resultNumber = exchange.exchangeDecimal(number);
                    System.out.print("Mã nhị phân " + numberBinary + " chuyển thành " + resultNumber);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Mời bạn nhập số hệ thập phân: ");
                    int num = Integer.parseInt(sc.nextLine());
                    List lits = exchange.exchangeHexadecimal(num);
                    System.out.print("Mã thập phân " + num + " chuyển thành mã thập lục phân: ");
                    lits.forEach(System.out::print);
                    System.out.println();
                    break;
                case 4:
                    System.exit(1);

            }
        }
    }
}
