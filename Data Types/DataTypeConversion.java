public class DataTypeConversion {
  public static void main(String[] args) {

    byte a = 20;
    int b = a;
    System.out.println("a=" + a + ", b=" + b);

    long x = 10;
    int y = (int)x; // long to int  
  }  
}
