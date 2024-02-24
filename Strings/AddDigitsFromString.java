// Prog8r7am1 -> 8+7+1 = 16

class AddDigitsFromString {
  public static void main(String[] args) {
    String input = "Prog8r7am1";
    int sum = addDigits(input);
    System.out.println("Sum is : " + sum);
  }

  static int addDigits(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i); // '8' 8
      if (Character.isDigit(ch)) { 
        sum = sum + Character.getNumericValue(ch); // '8' -> 8
      }
    }
    return sum;
  }
}