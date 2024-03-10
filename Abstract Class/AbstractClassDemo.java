abstract class Shape {
  abstract float area();
}

class Circle extends Shape {
  float radius;
  Circle(float r) { this.radius = r; }
  @Override
  float area() {
    return (float)Math.PI * this.radius * this.radius;
  }
}
class Square extends Shape{
  float side;
  Square(float s) { this.side = s;}
  @Override
  float area() {
    return side * side;
  }
}

class AbstractClassDemo {
    public static void main(String[] args) {
      Shape s1 = new Circle(5);
      Shape s2 = new Square(4);
      System.out.println("Area of Circle with radius 5 is: " + s1.area());
      System.out.println("Area of Square with side 5 is: " + s2.area());
    }
}