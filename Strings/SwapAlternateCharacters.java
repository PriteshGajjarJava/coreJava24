  // input = "Programming";
  // output   = "rPgoarmmnig"

class SwapAlternateCharacters {
  public static void main(String[] args) {
    String input = "abcdefgh";
    String output = swapAlternateChar(input);
    System.out.println("Output is:" + output);
  }

  static String swapAlternateChar(String str) {
    String output = "";
    // abc
    for (int i = 0; i < str.length() -1 ; i+=2) {
      output = output + str.charAt(i+1) + str.charAt(i);
    }

    // ODD case
    if (output.length() != str.length()) {
      output = output + str.charAt(str.length() - 1);
    }

    return output;
  }
}