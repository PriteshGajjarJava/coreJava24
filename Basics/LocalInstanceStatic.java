public class LocalInstanceStatic {
  public static void main(String[] args) {
    Emp e1 = new Emp();
    int ans = e1.f1();
    System.out.println("ANS:" + ans);
    System.out.println(Emp.count);
  }
}
class Emp {
  static int count = 0;
  int id = 5;

  int f1() {
    int id = 40;
    Emp.count++;
    this.id = this.id + 10;
    this.id = this.f2();
    return this.id + id;
  }
  int f2() {
    Emp.count = Emp.count + 10;
    int a = this.id + Emp.count;
    return a;
  }
}
