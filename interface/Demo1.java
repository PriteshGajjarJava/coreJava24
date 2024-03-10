interface Demo1 {
  int x = 10;// public static final int x = 10
  void f1(); // public abstract void f1()

  // Default methods - From Java 8
  default void f2() {
    System.out.println("f2");
  }
  // Demo1() {} //  ERROR - Constructor not allowd
}

class A implements Demo1 {
  @Override
  public void f1() { // Method has to be "public"
    System.out.println(Demo1.x);// accessing static variable
    // Demo1.x++; // ERROR - final variable can NOT be changed
    System.out.println("A:f1");
  }
}
class Test {
  public static void main(String[] args) {
    A obj = new A();
    obj.f1();
    obj.f2();
  }
}

