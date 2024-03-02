class X {
  int a = 10;
  X() {
    System.out.println("X");
  }
}
class Y extends X{
  int a = 20;
  void display() {
    this.a = this.a * 2; // 20*2 = 40
    super.a = this.a + super.a; // 40+10=50
    System.out.println(super.a);///
  }
}
class Z extends Y {
  int a = 30;
  Z() {
    System.out.println("Z");
  }

  @Override
  void display() {
    super.display();
    System.out.println(super.a);
  }
}

class SuperPuzzle {
    public static void main(String[] args) {
      Z obj1 = new Z();// X Z
      obj1.display();
    }
}