import java.util.Arrays;
public class ArraySort {
  public static void main(String[] args) {
    int[] arr = { 7, 10, 2, 12, 3, 15, 11};
    // Arrays.sort(arr); -- in-built function to SORT
    bubbleSort(arr);
    System.out.println("Sorted array is: " + Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          // swap logic
          int t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
      }
    }
  }

}
