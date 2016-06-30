import java.util.*;

public class NonDestructiveBubbleSort {
	public static int[] bubble_sort(int array[]) {
		int[] copy = array.clone();
		//Keep around a variable n that will be assigned to the array's length since we want to iterate in the outer loop a total of the array's length times
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			//The inner for loop helps us keep track of a second pointer to the next element in the array. So, we'd be able to look at index 0 and index 1 and compare them, then index 1 and index 2. 
			for (int i = 0; i < n - 1; i++) {
				//This line lets us look at the next upcoming element (k is right after i).
				k = i + 1;
				//if the second element is greater than the first element, then we want to swap. 
				if (copy[k] < copy[i]) {
					//call the method below, passing in the array as well (we're doing destructive modification).
					swapNumbers(i, k, copy);
				}
			}	
		}
		return copy;
	}

	private static void swapNumbers(int i, int j, int[] array)  {
		//first we want to store array[i] into a temporary variable so that we can store the var into array[j]
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


	public static void main(String[] args) {
		int[] input = {4, 23, 99, 3, 53, 22, 44, 25, 3};
		int[] finalArray = bubble_sort(input);
		System.out.println(Arrays.toString(finalArray));
	}










}
