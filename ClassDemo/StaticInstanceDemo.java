public class StaticInstanceDemo {
  public static void main(String[] args) {
    StaticInstanceDemo.f1();
    Hello obj = new Hello();
    obj.f2();
    StaticInstanceDemo obj1 = new StaticInstanceDemo();
    obj1.f2();
    Hello.f3()
  }
  static void f1() {
    System.out.println("Hi!");
  }
  void f2() {
    System.out.println("Let's Learn");
  }

}
class Hello {
  void f2() {
    System.err.println("How are you?");
  }
  static void f3() {
    System.out.println(" Java ");
  }
}