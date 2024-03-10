class RuntimePoly2 {
  public static void main(String[] args) {
    Y obj = new Y();
    obj.f1(); // Y:f1
    obj.f2(); // X:f2 Y:f1
  }
}
class X {
  void f1() { System.out.println("X:f1");}

  void f2() {
    System.out.println("X:f2");
    this.f1();
  }
}
class Y extends X {
  @Override
  void f1() {
    System.out.println("Y:f1");
  }
}

