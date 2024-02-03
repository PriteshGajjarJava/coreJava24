public class LocalVsInstance {
  public static void main(String[] args) {
    int x = 50;
    Box1 b1 = new Box1();
    b1.f1();
    System.out.println("x=" + x + ", b1.x=" + b1.x);
  }
}

class Box1 {
  int x = 10;
  
  public void f1() {
    int x = 20;
    System.out.println("x = " + x);
    this.x = this.x + x;
    System.out.println("this.x = " + this.x);
  }
}
