public class FindMinMax {
  public static void main(String[] args) {
    int[] a = {9, 19, 1, 20, 8, 3, 10};
    int max = findMax(a);
    int min = findMin(a);
    System.out.println("Min: " + min + ", Max=" + max);
  }
  static int findMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  static int findMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

}
