public class MySelectionSort {
	public static int[] doSelectionSort(int[] arr) {

		//First, we will need to look at index = 0, and then find the smallest number in the array. 
		for (int i = 0; i < arr.length - 1; i++) {

			//This index is going to keep track of the smallest index element we've seen so far.
			int index = i;

			//This for loop helps iterate through the 1st to the nth element in the array, to see if we find a smaller indexed element. 
			for (int j = i + 1; j < arr.length; j++) {


				//Right here, we see that we can update our index to a new j index. 
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			//Here, we keep our smaller number in a temporary variable "smallerNumber"
			int smallerNumber = arr[index];

			//Now, we update arr[index] to arr[i] because we want to swap the original value with the smallest value index space. 
			arr[index] = arr[i];

			//Finally, we set the smallest number in the index for our outer for loop. 
			arr[i] = smallerNumber;
		}
		
		return arr;
	}

	public static void main(String a[]) {
		  int[] arr1 = {10,34,2,56,7,67,88,42};
        	int[] arr2 = doSelectionSort(arr1);
        	for (int i : arr2) {
            System.out.println(i);
            
        	}
	}
}