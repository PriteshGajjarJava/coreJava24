//input  : This is Leap Year
//output : sihT si paeL raeY
class ReverseEachWord {
  public static void main(String[] args) {
    String input = "This is Leap Year";
    String output = reveseEachWord(input);
    System.out.println(output);
  }

  static String reveseEachWord(String input) {
    String[] w = input.split(" ");

    for (int i = 0 ; i < w.length; i++) {
      w[i] = reverse(w[i]);
    }
    return String.join(" ", w);
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