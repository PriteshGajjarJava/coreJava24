import java.util.Arrays;

public class PowerOfArrayElements {
  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 6, 9, 10}; // input

    // Using java 8 lambda expression
    int[] pow = Arrays.stream(arr).map((d -> d * d)).toArray();
    System.out.println("Output with power is: " + Arrays.toString(pow));

    powerOfArrayDataOriginal(arr);
    System.out.println("Output is: " + Arrays.toString(arr));
  }

  static int[] powerOfArrayData(int[] arr) {
    int[] pow = new int[arr.length];
    for(int i=0; i < arr.length; i++) {
      pow[i] = arr[i] * arr[i];
    }
    return pow;
  }

  // Changing original array
  static void powerOfArrayDataOriginal(int[] arr) {
    for(int i=0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
  }
}


