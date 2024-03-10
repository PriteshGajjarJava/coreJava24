abstract class A1 {
  A1() {
    System.out.println("A1: constructur");
  }

  void f1(){
    System.out.println("A1:f1");
  }
  abstract void f2();
}

abstract class B extends A1 {
  B() {
    System.out.println("B: constructor");
  }
// }
// class C extends B {

// }

class Demo1 {
  public static void main(String[] args) {
    B obj = new B();
  }
}