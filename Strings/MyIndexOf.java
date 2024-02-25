// "Java Program"
// Write own implementation of indexOf() and lastIndexOf()

class MyIndexOf {
    public static void main(String[] str) {
      String input = "Java Program";

      int index = myIndexOf(input, 'g');
      int lastIndex = myLastIndexOf(input, 'a');
      System.out.println("indexOf('g'): " + index);// 8
      System.out.println("lastIndexOf('a'): " + lastIndex);//10
    }

    static int myIndexOf(String input, char ch) {
      char[] arr = input.toCharArray();
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == ch) {
          return i;
        }
      }
      return -1;
    }
    static int myLastIndexOf(String input, char ch) {
      char[] arr = input.toCharArray();
      for (int i = arr.length-1; i >= 0; i--) {
        if (arr[i] == ch) {
          return i;
        }
      }
      return -1;
    }
}