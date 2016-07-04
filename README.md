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


####Selection Sort - (ELI5)
Given this array, we want to perform selection sort on it: [ 5, 4, 1, 3, 2 ].

Selection sort basically takes hold of one element, then looks at all the other elements after it to find the smallest element. If there is a smallest element, then it switches places with that first element we took hold of. 

Example:
[ 5, 4, 1, 3, 2 ].
First, 5 is our anchor element. We then go through the rest of the array, and see if the element is smaller than 5. 
Since 4 is smaller than 5, our index variable gets set to 1. 
Since 1 is smaller than 4, our index variable gets set to 2.
Since 3 is greater than 1, we don't set our index variable.
Since 2 is greater than 1, we don't set our index variable.

Now since we went through the entire array, we need to perform the swapping.
1 gets stored into a temporary variable
Array[2] = 5
Array[0] = temp_var (which is 1)

Now our array looks like this:
[1, 4, 5, 3, 2].

We now have 4 as our anchor element. 

Since 5 is greater than 4, we don't set our index variable. 
Since 3 is less than 4, our index variable gets set to 3.
Since 2 is less than 3, our index variable gets set to 4.

Now, we need to perform the swap.
2 gets stored into a temporary variable. 
Array[4] = Array[1] (this is because our counter is now index 1)
Array[1] = temp_variable (which is 2)

Our array looks like this:

[1, 2, 5, 3, 4].

If we continue on, our array will then take these forms:
[1, 2, 3, 5, 4]
[1, 2, 3, 4, 5]
Done.

Runtime:
This algorithm has a runtime of O(n^2).
This is due to there being n - 1 checks initially, then n - 2, then n - 3, ... 1. When we sum all of this up we have: n(n - 1)/2 which is bounded by O(n^2). 

####Insertion Sort - (ELI5)

Insertion sort basically works like this: starting with one element in the array (index one), we want to start building up a sorted list in front of it. So if we have an array like this:

[10, 9, 8, 3, 1]
First, we want to look at 9. We compare 9 with 10, and see that 9 should be before 10. So we do this:
[9, 10, 8, 3, 1].
Then, we look at 8.
Since 8 is less than 10, we swap those two. 
[9, 8, 10, 3, 1].
Since 8 is less than 9, we swap those two again.
[8, 9, 10, 3, 1].
Now we look at 3.
Since 3 is less than 10, we swap those two.
[8, 9, 3, 10, 1].
Since 3 is less than 9, we swap those two.
[8, 3, 9, 10, 1].
Since 3 is less than 8, we swap those two. 
[3, 8, 9, 10, 1].
Now, we have just one element left.
We look at 1, its smaller than 10 so we swap the two.
[3, 8, 9, 1, 10]
We now look at 1 and 9. Swap
[3, 8, 1, 9, 10]
We now look at 1 and 8. Swap
[3, 1, 8, 9, 10]
We now look at 3 and 1. Swap
[1, 3, 8, 9, 10].
Done.

Runtime analysis:
Best case: Already sorted. In this case, it would be linear O(n) because we would be comparing the element with the rightmost element of the already sorted list. 

Worst case: Reverse order. In this case, it would be quadratic as we would need to shift the entire sorted list over every time to put a new element in. 









