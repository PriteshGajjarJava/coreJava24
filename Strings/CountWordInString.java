class CountWordInString {
  public static void main(String[] args) {

    String input = "While conventional search engines ranked results by counting how many times the search terms appeared on the page, they theorized about a better system that analyzed the relationships among websites";
    String pattern = "THE";

    int cnt = countPatternInString(input, pattern);
    System.out.println("Answer is: " + cnt);
  }

  static int countPatternInString(String str, String w) {
    str = str.toLowerCase();
    w = w.toLowerCase();
    int cnt = 0;
    while (true) {
      int position = str.indexOf(w);
      if (position == -1) {
        break;
      }
      cnt++;
      // IMP
      str = str.substring(position + w.length());
    }
    return cnt;
  }
}