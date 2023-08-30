# Sorting Algorithms Implementation

## Description
This Java code implements various sorting algorithms, including merge sort, heap sort, and quick sort. The code focuses on sorting an array of integers and provides methods for comparing elements and tracking comparisons during the sorting process.

## Class: Algorithms

### Properties
- `compareCount`: A static integer variable used to keep track of the number of comparisons made during sorting.

### Constructor
- `Algorithms()`: A constructor that initializes the sorting algorithm class. It is used to set up properties and methods for sorting operations.

### Method: resetCounter
- `public void resetCounter()`: Resets the `compareCount` variable to zero. This method is used to reset the comparison counter before starting a new sorting operation.

### Method: copy
- `public int[] copy(int[] mergeArray)`: Creates a copy of the input integer array `mergeArray`. It iterates through the input array and creates a new array with the same elements.

### Method: Count
- `public static void Count(int i, int j)`: A static method used to increment the `compareCount` variable, which tracks the number of comparisons made during sorting.

### Method: mergesort
- `public void mergesort(int[] mergeArray)`: Initiates the merge sort algorithm on the input integer array `mergeArray`. It calls the `mergesortA` method to start the sorting process and prints the total number of comparisons after sorting.

### Method: mergesortA
- `public void mergesortA(int[] mergeArray, int start, int end)`: Implements the merge sort algorithm recursively on the input array `mergeArray`. It divides the array into smaller segments until they are individually sorted and then merges them back together using the `mergesortB` method.

### Method: mergesortB
- `private void mergesortB(int[] mergeArray, int start, int end)`: Performs the merging step of the merge sort algorithm. It compares and merges the divided arrays back into the original array.

### Method: heapsort
- `public void heapsort(int Array[])`: Initiates the heap sort algorithm on the input integer array `Array`. It converts the input array into a max heap and then sorts it by repeatedly extracting the maximum element from the heap.

### Method: heap
- `void heap(int arr[], int len, int i)`: Converts the input array `arr` into a max heap. It ensures that the largest element is at the root of the heap.

### Method: swap
- `public static void swap(int[] array, int i, int j)`: Swaps two elements in the input array `array` given their indices `i` and `j`. It is used for various swapping operations within sorting algorithms.

### Method: quickSort
- `public void quickSort(int[] arrQ)`: Initiates the quick sort algorithm on the input integer array `arrQ`. It partitions the array and recursively sorts sub-arrays using the `quickSort` method.

### Method: quickSort (overloaded)
- `private void quickSort(int[] arrQ, int low, int high)`: Recursively sorts a sub-array within the range defined by `low` and `high`. It selects a pivot element, partitions the array, and sorts the left and right sub-arrays.

### Method: partition
- `private int partition(int[] arrQ, int low, int high)`: Partitions the input array `arrQ` using the pivot element as the comparison reference. It rearranges elements such that elements less than the pivot are on the left side and elements greater than the pivot are on the right side.

## Usage
1. Instantiate the `Algorithms` class.
2. Use the various sorting methods such as `mergesort`, `heapsort`, and `quickSort` to sort arrays.
3. The `compareCount` variable keeps track of the number of comparisons made during sorting operations.

## Notes
- The code demonstrates the implementation of merge sort, heap sort, and quick sort algorithms.
- The comparison count is incremented using the `Count` method to track the efficiency of each sorting algorithm.

This code provides a comprehensive implementation of three fundamental sorting algorithms and can be used to study their performance and behavior on different types of input data.
