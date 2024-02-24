class CountTotalWords {
    public static void main(String[] args) {
      String s = "Page and Brin originally nicknamed the new search engine";
      int cnt = countWords(s);
      System.out.println("Total number of words are: " + cnt );
    }

    static int countWords(String str) {
      // String[] w = str.split(" ");
      // return w.length;

      return str.split(" ").length;
    }
}