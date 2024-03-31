import java.util.*;
import java.util.List;
class Student {
  int id;
  String name;
  float marks;
  Student(int id, String name, float marks) {
    this.id = id; this.name = name; this.marks = marks;
  }

  @Override
  public String toString() {
    return "{" + this.id +"," + this.name +"," +this.marks+"}";
  }

}

class IDComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    return s1.id > s2.id ? 1 : -1;
  }
}

class NameComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    return s1.name.compareTo(s2.name);
  }
}
class MarksComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    return s1.marks > s2.marks ? -1 : 1;
  }
}
class ComparatorDemo {
    public static void main(String[] args) {
      List<Student> list = new ArrayList<Student>();
      list.add(new Student(11, "Eleven", 77));
      list.add(new Student(15, "Fifteen", 89));
      list.add(new Student(12, "Twelve", 65));
      list.add(new Student(9, "Nine", 49));

      Collections.sort(list, new IDComparator());
      System.out.println("Sotred by ID: " + list);
      Collections.sort(list, new NameComparator());
      System.out.println("Sotred by Name: " + list);
      Collections.sort(list, new MarksComparator());
      System.out.println("Sotred by Marks: " + list);

    }
}