public class PassByPuzzle3 {
    public static void main(String[] args) {
      float mySalary = 5000;
      Emp e1 = new Emp();
      Emp.update(e1, mySalary);
      System.out.println(mySalary + "," + e1.salary);
    }
}

class Emp {
  float salary = 10000;
         
  static void update(Emp e, float salary) {
    salary = salary + 2000;
    e.salary = e.salary + salary;
  }
}