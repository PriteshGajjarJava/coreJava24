abstract class A2 {
  abstract void f1();
  void f2() {
    System.out.println("A2:f2");
  }
}
class B2 extends A2 {
  @Override
  void f1() {
    System.out.println("B:f1");
  }
}
class Demo2 {
  public static void main(String[] args) {
    B2 obj = new B2();
    obj.f1();
    obj.f2();
  }
}