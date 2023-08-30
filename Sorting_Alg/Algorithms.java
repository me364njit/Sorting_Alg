// Muhab Elgamal
// HW2 Sorting Algorithms
// CS 435 Dr. Nassimi

class Algorithms {
  static int compareCount;

  Algorithms() {}

  public void resetCounter() {
    compareCount = 0;
  }

  public int[] copy(int[] mergeArray) {
    int[] copiedArray = new int[mergeArray.length];
    for (int i = 0; i < mergeArray.length; i++) {
      copiedArray[i] = mergeArray[i];
    }

    return copiedArray;
  }

  public static void Count(int i, int j) {

    compareCount++;
  }

  // merge sort logic
  public void mergesort(int[] mergeArray) {
    mergesortA(mergeArray, 0, mergeArray.length - 1);
    System.out.println("COMPARISION = " + compareCount + "    ");
  }

  public void mergesortA(int[] mergeArray, int start, int end) {
    if (start >= end) {
      return;
    } else {
      int mid = (start + end) / 2;
      mergesortA(mergeArray, start, mid);
      mergesortA(mergeArray, mid + 1, end);
      mergesortB(mergeArray, start, end);
    }
  }

  private void mergesortB(int[] mergeArray, int start, int end) {

    int[] temp = copy(mergeArray);
    int mid = (start + end) / 2;
    int index1 = 0;
    int index2 = start;
    int index3 = mid + 1;
    while (index2 <= mid && index3 <= end) {
      Count(mergeArray[index2], mergeArray[index3]);
      if (mergeArray[index2] < mergeArray[index3]) {

        temp[index1] = mergeArray[index2];
        index1++;
        index2++;
      } else {
        temp[index1] = mergeArray[index3];
        index1++;
        index3++;
      }
    }
    while (index2 <= mid) {
      temp[index1] = mergeArray[index2];
      index1++;
      index2++;
    }
    while (index3 <= end) {
      temp[index1] = mergeArray[index3];
      index1++;
      index3++;
    }
    for (int i = start, j = 0; i <= end; i++, j++) {
      mergeArray[i] = temp[j];
    }
  }

  // heap sorting logic
  public void heapsort(int Array[]) {
    int len = Array.length - 1;

    for (int i = len / 2; i >= 0; i--) {
      heap(Array, len + 1, i);
    }

    for (int i = len; i >= 0; i--) {
      swap(Array, 0, i);
      heap(Array, i, 0);
    }
    System.out.println("  " + "Comparision = " + compareCount);
  }

  void heap(int arr[], int len, int i) {

    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < len && arr[left] > arr[largest]) {
      largest = left;
    }
    if (right < len && arr[right] > arr[largest]) { // Count(r ,arr[r]);
      largest = right;
    }

    if (largest != i) {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      heap(arr, len, largest);
    }
    Count(left, right);
  }

  public static void swap(int[] array, int i, int j) {
    int t = array[i];
    array[i] = array[j];
    array[j] = t;
  }

  // quick sort
  public void quickSort(int[] arrQ) {
    quickSort(arrQ, 0, arrQ.length - 1);
    System.out.println(" Comparision=" + compareCount + "   ");
  }

  private void quickSort(int[] arrQ, int low, int high) {
    if (low < high) {
      int mid = partition(arrQ, low, high);
      quickSort(arrQ, low, mid - 1);
      quickSort(arrQ, mid + 1, high);
    }
  }

  private int partition(int[] arrQ, int low, int high) {

    int pivot = arrQ[low];
    do {

      while (low < high && arrQ[high] >= pivot) {
        high--;
        Count(arrQ[high], pivot);
      }
      if (low < high) {
        arrQ[low] = arrQ[high];
        while (low < high && arrQ[low] <= pivot) {
          low++;
          Count(arrQ[high], pivot);
        }
        if (low < high) {
          arrQ[high] = arrQ[low];
        }
      }
    } while (low < high);
    arrQ[low] = pivot;
    return low;
  }
}
