public class Puzzle2 {
  public static void main(String[] args) {
    System.out.println("main");
    Circle c = new Circle();
  }
  Puzzle2() { System.out.println("ONE");}
  { System.out.println("Puzzle2: instance")} 
}

class Circle {
  { System.out.println("Circle: Instance");}
  Circle() {
    System.out.println("Circle constructor");
    Puzzle2 p = new Puzzle2();
  }
}
