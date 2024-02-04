public class StudentDemo {
  public static void main(String[] args) {
    Student obj = new Student();
    obj.run(); // Calling instance method of Student class
    Student.breathe(); // Calling static method of Student class
  }
}
class Student {
  public void run() {
    this.jogging(); // Calling instance method on current object
    System.out.println("RUN");
    Student.breathe(); // calling static method of your own class
  }
  private void jogging() {
    System.out.println("Jogging first ...");
  }
  public static void breathe() {
    System.out.println("BREATH");
  }
}