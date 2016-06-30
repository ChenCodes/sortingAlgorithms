# sortingAlgorithms
Repo that includes explanations of common sorting algorithms as well as their complexity


####Bubblesort - (ELI5)
Given an array or some kind of list of unsorted numbers, we can use bubble sort to sort the elements.

Here's how it works:

Let's say we have this array: [10, 5, 3, 2, 1]
We first pass through the array, looking at adjacent numbers. 
We consider 10 and 5. Since 10 is greater than five, we need to "swap" them. In the code, we'll save the number 10 into a temporary variable so that we can access it later and modify the space in the array that the 10 currently is staying in. 

Then, we put 5 into the first space in the array: [5, 5, 3, 2, 1]. 
Now, we put 10 into the space where 5 used to be (thanks to our temporary variable, we still have it around). 
Now the array looks like this:[5, 10, 3, 2, 1].

Now, we increment our index in the for loop and look at 10 and 3. Since 10 is greater than 3, we want to perform the swap again.
[5, 3, 3, 2, 1] ->
[5, 3, 10, 2, 1]

We continue on until the array looks like this:
[5, 3, 2, 10, 1] ->
[5, 3, 2, 1, 10]

However, we notice that we aren't done yet!
We will need to continue making passes through the array until the array is completely sorted; only then will we stop. 
For our second pass, here's what the array will look like:

[3, 5, 2, 1, 10]->
[3, 2, 5, 1, 10]->
[3, 2, 1, 5, 10]

Another iteration:

[2, 3, 1, 5, 10]->
[2, 1, 3, 5, 10]

Another iteration:

[1, 2, 3, 5, 10]

At this point, our array has been completely sorted and we have iterated a total of 4 times in our outer for loop. To ensure that we have succeeded in sorting the entire array and not finishing the algorithm prematurely, we pass through the array (array.length) times. 

Runtime:
For an already sorted list, performance will be O(n). <- best case.
For an unsorted list, performance will be O(n^2). <- worst case / average case
This is due to having an outer for loop and an inner for loop that loops about n iterations each: n * n = n^2. 
All in all, bubble sort is not an ideal algorithm to sort an array with a large number of elements. 













