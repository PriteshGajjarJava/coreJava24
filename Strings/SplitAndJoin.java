import java.util.Arrays;

public class SplitAndJoin {
  public static void main(String[] args) {
    String str = "This is string program";
    String[] words = str.split(" ");// ["This", "is", "string", "program"]
    System.out.println(Arrays.toString(words));
    System.out.println(words.length);//4

    String ans = String.join("#", words);
    System.out.println(ans);
  }  
}
