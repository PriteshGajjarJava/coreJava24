public class WrapperClassDemo {
  public static void main(String[] args) {
    int ans1 = power(5); // int to Integer

    Integer ans2 = power(Integer.valueOf(7));

    System.out.println(ans1);
    System.out.println(ans2);
  } 
  
  static Integer power(Integer i) {
    // Integer to int
    return i * i;//int * int -> Integer 
  }
}
