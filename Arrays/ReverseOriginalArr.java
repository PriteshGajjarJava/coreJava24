import java.util.Arrays;

public class ReverseOriginalArr {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    reverse(arr); // Reverse original array
    System.out.println("After reverse array is: " + Arrays.toString(arr));
  }

  static void reverse(int[] arr) {
    for (int i=0, j=arr.length - 1; i < j; i++, j--) {
      // swap logic
      int temp = arr[i];
      arr[i] = arr[j]; 
      arr[j] = temp;
    }
  }
}
