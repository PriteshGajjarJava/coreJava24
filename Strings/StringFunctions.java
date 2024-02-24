public class StringFunctions {
  public static void main(String[] args) {
    String s1 = "We are learning Java";

    // Length
    int len = s1.length();
    System.out.println("length of string is: " + len);

    // To get 7th char
    char ch = s1.charAt(7);
    System.out.println("Character at 7th position is: " + ch);

    int index1 = s1.indexOf('r'); // 4
    System.out.println("index of 'r' is: " + index1);

    int lastIndex = s1.lastIndexOf('r'); // 10
    System.out.println("last 'r' position: " + lastIndex);

    System.out.println("indexOf earn is:" + s1.indexOf("earn"));

    String s2 = s1.substring(5);//"e learning Java"
    System.out.println(s2);

    String s3 = s1.substring(7,12);// learn
    System.out.println(s3);

    boolean b1 = s1.contains("learn");
    // s1.startsWith("We"); // True
    // s1.endsWith(("."))
    System.out.println(s1.indexOf("xyz"));

    String p = "Pune";
    String p1 = p.toUpperCase(); // PUNE

    String q = "    abc pqr     ";
    q = q.trim();
    System.out.println(q);

    String a = "Abc";
    String b = "PQr";
    String c = a + b; // a.concat(b);

    // We are learning java
    s1 = s1.replace('a', '@');
    System.out.println(s1);
    
    String str = "Mumbai";
    char[] arr = str.toCharArray(); // To convernt into array

    // Array to String
    String s = new String(arr);
    
    int i = Integer.valueOf("100");
  }  
}
