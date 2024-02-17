// WAP which will generate 2 different arrays ODD and EVEN array.
import java.util.Arrays;
public class OddEvenArr {
  public static void main(String[] args) {
    int[] arr = {8, 19, 10, 17, 13, 15, 0, 18, 22, 11};
    // int[] oddArr = getOddArray(arr);
    // int[] evenArr = getEvenArray(arr);

    // Only after Java8 - lambda expression
    int[] oddArr = Arrays.stream(arr).filter((d -> d%2 != 0)).toArray();
    int[] evenArr = Arrays.stream(arr).filter((d -> d%2 == 0)).toArray();

    System.out.println("Odd Array:" + Arrays.toString(oddArr));
    System.out.println("Even Array:" + Arrays.toString(evenArr));
  }

  static int[] getOddArray(int[] arr) {
    int[] oddArr = new int[arr.length];

    int j = 0;
    for(int i=0 ; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        oddArr[j] = arr[i];
        j++;
      }
    }
    return Arrays.copyOf(oddArr, j);
  }
  static int[] getEvenArray(int[] arr) {
    int[] evenArr = new int[arr.length];

    int j = 0;
    for(int i=0 ; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenArr[j] = arr[i];
        j++;
      }
    }
    return Arrays.copyOf(evenArr, j);
  }
}
