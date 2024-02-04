public class DataTypeTest {
  int x = 10; // instance variable
  public static void main(String[] args) {
    float f = 34.5f;
    long l = 89L;

    int a1bc = 5;
    System.out.println(a1bc);
  }  

  static int add(int a, int b) {
    return a + b;
  }

  boolean isAdult(int age) {
    return age >= 18;
  }
}
