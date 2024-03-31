import java.util.*;
import java.util.Set;

class Emp {
  int id;
  String name;
  Emp(int id, String name) { this.id = id; this.name = name; }

  @Override
  public String toString() {
    return "{id=" + this.id +", name=" + this.name+"}";
  }

  @Override
  public boolean equals(Object obj) {
    Emp e1 = this;
    Emp e2 = (Emp)obj;
    return e1.id == e2.id && e1.name.equals(e2.name);
  }

}

class UserDefinedSet {
    public static void main(String[] args) {
      Set<Emp> set = new HashSet<Emp>();
      Emp e1 = new Emp(11, "Fred");
      Emp e2 = new Emp(14, "Rob");
      Emp e3 = new Emp(5, "John");
      Emp e4 = new Emp(11, "Fred");
      System.out.println(e1);
      set.add(e1);  set.add(e2);  set.add(e3);  set.add(e4);
      System.out.println(set);     
    }
}