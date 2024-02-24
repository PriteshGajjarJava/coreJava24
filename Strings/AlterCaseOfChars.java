class AlterCaseOfChars {
     // String input = "My PrOgRAm";
     // output       = "mY pRoGraM"

    public static void main(String[] args) {
      String output = alterCase("My PrOgRAm");
      System.out.println("Output is: " + output);
    }

    static String alterCase(String str) {
      String output = "";

      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if(Character.isLowerCase(ch)) {
          output = output + Character.toUpperCase(ch);
        } else {
          output = output + Character.toLowerCase(ch);
        }
      }

      return output;
    }

}