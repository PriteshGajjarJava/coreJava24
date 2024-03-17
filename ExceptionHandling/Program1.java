class Program1 {
  public static void main(String[] args) {
    System.out.println("Start");
    f1();
    System.out.println("End");
  }

  static void f1() {
    System.out.println("F1 start");
    f2();
    System.out.println("F1 end");
  }
  static void f2() {
    System.out.println("F2 start");

    try {
      System.out.println("Try Start");
      System.out.println(8/0); // Exception occurred
      System.out.println("Try End");
    } catch(ArithmeticException e) {
      System.out.println("Please pass correct number for division. You can not divide number by 0");
    }

    System.out.println("F2 END");
  }
}
// # javac Program1.java 
// # java Program1 
// Start
// F1 start
// F2 start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// 	at Program1.f2(Program1.java:15)
// 	at Program1.f1(Program1.java:10)
// 	at Program1.main(Program1.java:4)

// How to solve this problem?
// Solution- Use try-catch block as below
// // Update f2() function as below

// static void f2() {
//   System.out.println("F2 start");

//   try {
//     System.out.println("Try Start");
//     System.out.println(8/0); // Exception occurred
//     System.out.println("Try End");
//   } catch(ArithmeticException e) {
//     System.out.println("Please pass correct number for division. You can not divide number by 0");
//   }

//   System.out.println("F2 END");
// }