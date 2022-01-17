package s3_array_and_method.exercise;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size array1");
        byte size1=scanner.nextByte();
        System.out.println("Enter size array2");
        byte size2=scanner.nextByte();
        int array1[]=new int[size1];
        int array2[]=new int[size2];
        int array3[]=new int[size1+size2];
        for(byte i=0; i<size1; i++){
            System.out.println("Enter element of array1 id "+(i+1)+":");
            array1[i]=scanner.nextInt();
            array3[i]=array1[i];
        }
        for(byte i=0; i<size2; i++){
            System.out.println("Enter element of array2 id "+(i+1)+":");
            array2[i]=scanner.nextInt();
            array3[size1+i]=array2[i];
        }
        for(byte i=0; i<array1.length; i++){
            System.out.print(array1[i]);
        }
        System.out.println("");
        for(byte i=0; i<array2.length; i++){
            System.out.print(array2[i]);
        }
        System.out.println("");
        for(byte i=0; i<array3.length; i++){
            System.out.print(array3[i]);
        }
    }
}
