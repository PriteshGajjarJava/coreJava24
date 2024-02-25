import java.util.regex.Pattern;
class VowelCount {
    public static void main(String[] args) {
      String str = "An elephant is big animal";
      int cnt = countVowels(str);
      System.out.println("Count of vowels is: " + cnt);
    }

    static int countVowels(String str) {
      int cnt = 0;
      for (int i=0; i < str.length(); i++) {
        if (isVowel(str.charAt(i))) {
          cnt++;
        }
      }
      return cnt;
    }

    static boolean isVowel(char ch) {
      // aeiou or AEIOU
      Pattern VOWELS_PATTERN = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
      return VOWELS_PATTERN.matcher(""+ch).matches(); // 'a' -> ""+'a' => "a"
    }
}