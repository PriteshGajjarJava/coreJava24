class RuntimePoly1 {
  public static void main(String[] args) {
    B obj1 = new C();
    obj1.f1(); // B:f1
    obj1.f2(); // B:f2
    obj1.f3(); // C:f3

    A obj = new C();
    obj.f1();
    ((C)obj).f2();
    obj.f3();
  }
}
class A {
  void f1() { System.out.println("A:f1"); }
  void f3() { System.out.println("A:f3"); }
}
class B extends A {
  void f2() { System.out.println("B:f2"); }
  @Override
  void f1() { System.out.println("B:f1"); }
}
class C extends B {
  void f3() { System.out.println("C:f3"); }
}