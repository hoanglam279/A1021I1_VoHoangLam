package s3_array_and_method.practice;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 6, 1, 96, 5};
        int index = minElement(arr);
        System.out.println("The smallest element in the array is " + arr[index]);
    }

    public static int minElement(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[index])
                index = i;
        }
        return index;
    }
}
