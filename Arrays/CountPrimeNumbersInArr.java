// Count PRIME numbers in an array:

public class CountPrimeNumbersInArr {
    public static void main(String[] args) {
      int[] arr = {1, 7, 18, 11, 23, 49, 39, 71}; // 4
      int cnt = countPrime(arr);
      System.out.println("Count is: " + cnt) ;
    }

    static int countPrime(int[]arr) {
      int cnt = 0;
      for (int data:arr) {
        if (isPrime(data)) {
          cnt++;
        }
      }
      return cnt;
    }

    static boolean isPrime(int n) {
      if (n < 2) return false;
      if (n == 2) return true;
      for (int i=2; i < n/2; i++) {
        if (n % i == 0) { return false; }
      }
      return true;
    }
}

