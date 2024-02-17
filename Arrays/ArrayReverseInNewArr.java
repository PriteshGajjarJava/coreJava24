import java.util.Arrays;

public class ArrayReverseInNewArr {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};// input
    int[] rev  = reverseArr(arr);
    System.out.println("Reverse array is: " + Arrays.toString(rev));
  }

  static int[] reverseArr(int[] arr) {
    int[] rev = new int[arr.length];
    for (int i= arr.length - 1 , j=0 ; i >= 0; i--, j++) {
      rev[j] = arr[i];
    }
    return rev;
  }
}
