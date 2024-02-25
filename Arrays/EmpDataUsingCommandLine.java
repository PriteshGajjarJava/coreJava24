class EmpDataUsingCommandLine {
    public static void main(String[] args) {
      int eId = Integer.parseInt(args[0]); // "12" -> 12
      String eName = args[1];
      float eSalary = Float.parseFloat(args[2]);
      Emp e1 = new Emp(eId, eName, eSalary);
      System.out.println("[" + e1.id + "," + e1.name + "," + e1.salary + "]");
    }
}

class Emp {
  int id;
  String name;
  float salary;
  Emp (int id, String name, float salary) {
    this.id = id; this.name = name; this.salary = salary;
  }
}