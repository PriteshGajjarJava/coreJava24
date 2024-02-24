class ReverseString {
  public static void main(String[] args) {
    String str = "Today is Saturday";
    String output = reverse(str);
    System.out.println(output);
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