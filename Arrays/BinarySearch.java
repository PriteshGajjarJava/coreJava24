public class BinarySearch {
  public static void main(String[] args) {
    // pre-condition: Array is always sorted
    int[] arr = {1, 5, 14, 20, 29, 33, 38,44,49, 58, 61,70, 78, 79, 89, 90, 95, 100};
    for (int i=0 ; i<=100; i++) {
      if (binarySearch(arr, i) == true) {
        System.out.println(i + " exists");
      }
    }
  }
  static boolean binarySearch(int[] arr, int e) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (end + start) / 2;
      if (arr[mid] == e) {
        return true;
      }

      if (e < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return false;
  }
}
