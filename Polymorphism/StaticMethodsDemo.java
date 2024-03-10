class StaticMethodsDemo {
    public static void main(String[] args) {
      Abc obj = new Xyz();
      obj.fun();//Xyz:fun
      obj.print();//Abc
    }
}
class Abc {
  static void print() {
    System.out.println("Abc");
  }
  void fun(){
    System.out.println("Abc:fun");
  }
}
class Xyz extends Abc {
  static void print() {
    System.out.println("Xyz");
  }
  @Override
  void fun(){
    System.out.println("Xyz:fun");
  }
}
