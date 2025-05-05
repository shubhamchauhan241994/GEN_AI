import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 12, 3, 8, 5, 6, 7, 8, 9, 10};
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting process done.
        System.out.println("Elements of array sorted in descending order is here ---->: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }

}}


