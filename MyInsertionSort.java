import java.util.*;

public class MyInsertionSort {
 
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
        //First we keep around a temporary variable.
        int temp;
        System.out.println(Arrays.toString(input));

        //In our first iteration, we want to go through the first element to the last element of the array. 
        for (int i = 1; i < input.length; i++) {

            //Then, we want to start comparing the 

            // if j = 5, then we compare array[5] with array[4], if array[4] is greater then we wanna swap  
            for (int j = i ; j > 0 ; j--) {

                //swap happens in here
                if (input[j] < input[j-1]) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
}
