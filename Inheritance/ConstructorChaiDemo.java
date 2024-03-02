class ConstructorChaiDemo {
    public static void main(String[] args) {
      // C obj = new C();
      // System.out.println("x=" + obj.x + ",y=" +obj.y +",z=" + obj.z);

      B obj = new B();
      System.out.println("x=" + obj.x + ",y=" +obj.y);
    }
}
class A {
  int x = 1;
  A() {
    System.out.println("A constructor");
  }
}
class B extends A {
  int y = 2;
  B() {
    System.out.println("B constructor");
  }
}
class C extends B {
  int z = 3;
  C() {
    System.out.println("C constructor");
  }
}