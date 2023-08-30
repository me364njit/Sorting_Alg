// Muhab Elgamal
// HW2 Sorting Algorithms
// CS 435 Dr. Nassimi

import java.util.Random;

public class Sorting {

  static int[] array1 = new int[4];
  static int[] array2 = new int[4];
  static int[] array3 = new int[4];
  static int[] temp1 = new int[4];
  static int[] temp2 = new int[4];
  static int[] temp3 = new int[4];

  // Sorted array 1-32
  public static void Sortedarray() {
    int i = 1;
    int j = 0;
    while (i <= array1.length) {
      array1[j] = i;
      j++;
      i++;
    }
  }

  // Reverse sorted array 32-1
  public static void RevSortedarray() {

    int i = array2.length;
    int j = 0;
    while (i > 0) {
      array2[j] = i;
      j++;
      i--;
    }
  }

  // Random array of 32 integers
  public static int[] randomIntarray(int size) {
    Random random = new Random();
    int tmp_array[] = new int[size];
    int i = 0;

    while (i < size) {
      boolean isDuplicate = false;
      int randomInt = random.nextInt(size) + 1;

      for (int j = 0; j < i; j++) {
        if (tmp_array[j] == randomInt) {
          isDuplicate = true;
          break;
        }
      }
      if (isDuplicate) {
        continue;
      } else {
        tmp_array[i++] = randomInt;
      }
    }
    return tmp_array;
  }

  // prints array
  public static void Printarray(int printarray[]) {
    int i;

    for (i = 0; i < printarray.length; i++) {
      System.out.print(printarray[i] + " ");
    }
    System.out.print("\n");
  }

  // Main
  public static void main(String[] args) {
    double startTimer, endTimer, ttlTime;
    Algorithms algo = new Algorithms();

    // Displaying arrays'
    Sortedarray();
    System.out.print("Sorted array:" + " " + "N=" + array1.length);
    System.out.println("");
    Printarray(array1);
    System.out.println();

    RevSortedarray();
    System.out.print("Reverse Sorted array:" + " " + "N=" + array2.length);
    System.out.println("");
    Printarray(array2);
    System.out.println();

    array3 = randomIntarray(array3.length);

    System.out.print("Randomly generated array:" + " " + "N=" + array3.length + "\n");
    Printarray(array3);
    System.out.println("");

    // coping array in temp ;
    temp1 = algo.copy(array1);
    temp2 = algo.copy(array2);
    temp3 = algo.copy(array3);

    System.out.println("********1- MERGE SORT (N=32)********");

    System.out.println("1.Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.mergesort(array1);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array1);
    System.out.println("");

    System.out.println("2.Reverse Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.mergesort(array2);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array2);
    System.out.println("");

    System.out.println("3.Randomly Generated array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.mergesort(array3);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array3);
    System.out.print("");
    System.out.print("\n");
    System.out.print("\n");

    // Resetting array to original versions
    array1 = algo.copy(temp1);
    array2 = algo.copy(temp2);
    array3 = algo.copy(temp3);

    // 2. Heap Sort
    System.out.println("********2- HEAP SORT (N=32)********");

    System.out.println("1.Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.heapsort(array1);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array1);
    System.out.println("");

    System.out.println("2.Reverse Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.heapsort(array2);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array2);
    System.out.println("");

    System.out.println("3.Randomly Generated array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.heapsort(array3);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array3);
    System.out.println("");

    // Resetting array to original versions
    array1 = algo.copy(temp1);
    array2 = algo.copy(temp2);
    array3 = algo.copy(temp3);

    // 3.Quick Sort
    System.out.println("********3- QUICK SORT (N=32)********");

    System.out.println("1.Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.quickSort(array1);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array1);
    System.out.println("");

    System.out.println("2.Reverse Sorted array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.quickSort(array2);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array2);
    System.out.println("");

    System.out.println("3.Randomly Generated array ");
    algo.resetCounter();
    startTimer = System.nanoTime();
    algo.quickSort(array3);
    endTimer = System.nanoTime();
    ttlTime = (endTimer - startTimer) / 1000000.0;
    System.out.println(" Time = " + ttlTime + " ms");
    System.out.print(" Resultant Sorted array:" + "\n");
    Printarray(array3);
    System.out.println("");
  }
}
