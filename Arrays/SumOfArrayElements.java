// Write a function which takes int array as an argument and returns addition of numbers in that array.

import java.util.Arrays;
public class SumOfArrayElements {
  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};
    // Addition of array elements using java8 aggregate function.
    int sum = Arrays.stream(arr).sum();
    System.out.println("SUM using java8: " + sum);

    int ans = sumOfArray(arr);


    System.out.println("Addition of array " +  Arrays.toString(arr) + " is: " + ans);
  }

  static int sumOfArray(int[] a) {
    int sum = 0;
    for (int n : a) {
      sum = sum + n;
    }
    return sum;
  }
}
