class FindWordWithMaxLength {
    public static void main(String[] args) {
      String s = "We are learning Java";

      String longestWord = findLongestWord(s);
      System.out.println("Longest word is: " + longestWord);
    }

    static String findLongestWord(String str) {
      int maxLen = 0;
      String longestWord = "";
      String[] w  = str.split(" "); // ["We","are","learning","java"]

      for (int i = 0; i < w.length; i++) {
        if (w[i].length() > maxLen) {
          maxLen = w[i].length();
          longestWord = w[i];
        }
      }
      return longestWord;
    }
}