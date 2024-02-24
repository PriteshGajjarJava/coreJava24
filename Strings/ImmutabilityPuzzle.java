public class ImmutabilityPuzzle {
  public static void main(String[] args) {
    String s1 = "Java"; //literal pool
    String s2 = "Java";
    String s3 = new String("Java");
    String s4 = new String("Java");
    String s5 = "JAVA";
  
    System.out.println(s1 == s2);//true
    System.out.println(s1 == s3);//false
    System.out.println(s3 == s4);//false

    s1 = s2.toUpperCase();
    System.err.println(s5 == s1);//TRUE
    System.out.println(s4);//JAVA
    System.out.println(s2);//Java
  }  
}
