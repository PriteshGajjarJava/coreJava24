import java.util.Arrays;
class CommandLineArgDemo {
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println(Arrays.toString(args));
  }
}

// java CommandLineArgDemo
// o/p is 0 []

// java CommandLineArgDemo 1 2 "abc"
// o/p is 3 ["1", "2", "abc"]

