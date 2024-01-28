class Student {
  int id;
  String name;
  float marks;

  // Default constructor
  Student() {
    System.out.println("In constructor");
  }

  // Parameterised constructor
  Student(int id, String name, float m) {
    this.id = id;
    this.name = name;
    this.marks = m; // OR marks = m
  }

  void print() {
    System.out.println("[" + this.id + "," + this.name + "," + this. marks +"]");
  }

  public static void main(String[] args) {
    Student s1 = new Student(); // Default construcotr [0, null, 0.0]
    s1.id = 5;
    Student s2 = new Student(1, "Fred", 80);// [1, Fred, 80]
    Student s3 = new Student(2, "John", 75);// [2, John, 75]

    s1.print();
    s2.print();
    s3.print();
  }
}