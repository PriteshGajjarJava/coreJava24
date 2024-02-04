public class DataTypePuzzle1 {
  public static void main(String[] args) {
    System.out.println("**** a-z Ascii value ****");
    DataTypePuzzle1.printAscii('a');
    System.out.println("**** A-Z Ascii value ****");
    DataTypePuzzle1.printAscii('A');
    System.out.println("**** 0-9 Ascii value ****");
    DataTypePuzzle1.printNumberAscii();
  }  
  static void printNumberAscii() {
    char digit = '0';
    for(int i=0; i <=9; i++) {
      System.err.println((char)(digit + i) + "=>" + (digit+i));
    }
  }
  // a-z
  static void printAscii(char start) {
    for (int i=0; i < 26; i++) {
      System.out.println((char)(start + i) + "=>" + (start+i));
    }
  }
}
