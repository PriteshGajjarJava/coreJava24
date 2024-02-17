import java.util.Arrays;
public class ReverseElementsInArr {
  public static void main(String[] args) {
    int[] arr = { 12, 44, 39, 109, 91, 10};

     int[] output = getArrayWithReverseData(arr);
    System.out.println("Output: " + Arrays.toString(output));
  }

  static int[] getArrayWithReverseData(int[] arr) {
    int[] output = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      output[i] = reverse(arr[i]);
    }
    return output;
  }

  static int reverse(int n) {
    int rev = 0;
    while (n > 0) {
      int rem = n % 10; // 9
      rev = rev*10 + rem;// 4
      n = n/10; 
    }
    return rev;
  }
}
