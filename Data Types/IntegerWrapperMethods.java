public class IntegerWrapperMethods {
  public static void main(String[] args) {
    int maxValue = Integer.MAX_VALUE;
    int minValue = Integer.MIN_VALUE;

    System.out.println("Integer max: " + maxValue);
    System.out.println("Integer min: " + minValue);
    System.out.println("Binary of 589: " + Integer.toBinaryString(589));
    System.out.println("Hex of 100: " +Integer.toHexString(100));
    System.out.println("Octal of 143: " + Integer.toOctalString(143));
    System.out.println("Reverse of 145 " +Integer.reverse(145));
  }  
}
