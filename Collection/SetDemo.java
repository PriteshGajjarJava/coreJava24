import java.util.*;
import java.util.Iterator;
import java.util.Set;

class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set = new TreeSet<Integer>();
    set.add(10);
    set.add(19);
    set.add(1);
    set.add(12);
    set.add(8);
    set.add(6);
    set.add(10);
    System.out.println(set);

    set.remove(12);
    System.out.println("Contains 19:" + set.contains(19));

    for (int data: set) {
      System.out.println(data);
    }
    Iterator<Integer> it = set.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    // [1, 19, 6, 8, 10, 12]
    System.out.println(set.size());
  }
}