class A1 {
  A1(){}
  A1(int x){}
}
class B1 extends A1 {
  B1() {
    super();
    System.out.println("B");
  }
}

class DefaultConstructorImportance {
  public static void main(String[] args) {
    B1 obj = new B1();
  }
}