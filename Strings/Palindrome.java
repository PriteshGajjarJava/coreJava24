// nitin -> nitin
// madam -> madam
// abcba -> abcba 
// 12321 -> 12321

class Palindrome {
  public static void main(String[] args) {
    String s  = "Nitin";
    boolean res = isPandindrome(s);
    System.out.println("Result is: " + res);
  }
  static boolean isPandindrome(String str) {
    String rev = reverse(str);
    return str.equalsIgnoreCase(rev);
  }

  static String reverse(String input) {
    char[] arr = input.toCharArray();// String to character array

    for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
      // Swap
      char t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
    }
    return new String(arr);// char array to String
  }
  
}
