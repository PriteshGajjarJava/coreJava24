public class PassByPuzzle4 {
  public static void main(String[] args) {
    float m1 = 90;
    String city = "Mumbai";
    createEmp(m1, city);
  }
  static void createEmp(float marks, String city) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.marks = 80;
    s2.marks = marks;
    s1.city = city;
    s2.city = "Pune";
    update(s1, s2);
    System.out.println("s1=" + s1.city +"," + s1.marks);
    System.out.println("s2=" + s2.city +"," + s2.marks);
  }
  static void update(Student s3, Student s4) {
    s4.marks = s3.marks + 10;
    s3.marks = s4.marks - 30;
    s4.city = s3.city;
    s3.city = s4.city;
  }
}

class Student {
  float marks;
  String city;
}
