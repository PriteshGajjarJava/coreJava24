// input  : We are learning Java
// output : Java learning are We
class ReverseSequenceOfWords {
  public static void main(String[] args) {
    String str = "We are learning Java";
    String output = reverseSequence(str);
    System.out.println(output);
  }

  static String reverseSequence(String str) {
    String[] w = str.split(" ");
    
    // Reverse an array
    for (int i=0, j = w.length-1; i < j; i++, j--) {
      // Swap
      String t = w[i];
      w[i] = w[j];
      w[j] = t;
    }
    return String.join(" ", w);
  } 
}