// Input : String, char
// Function will calculate total count of given char in string.
// e.g. String s = "aabcd abade", char ch = 'a' 
// ANS: 4
class CountLetters {
    public static void main(String[] args) {
      String s = "aabcd abade";
      char ch = 'a';
      int res = countLettersInString(s, ch);
      System.out.println("Result is: " + res);
    }


    // without traversing all characters
    static int countLettersInString(String str, char ch) {
      int cnt = 0;

      while (true) {
        int position = str.indexOf(ch);
        if (position == -1) {
          break;
        }
        cnt++;
        str = str.substring(position + 1);
      }

      return cnt;
    }

    // By traversing all chars
    static int countLettersInString1(String str, char ch) {
      int cnt = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
          cnt++;
        }
      }
      return cnt;
    }
}