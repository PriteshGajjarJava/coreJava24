import java.util.*;
import java.util.List;
class ListDemo {
    // ArrayList, LinkedList, Vector : List
    // ArrayList -> Not synchrnoized
    // Vector -> Synchrnoized
    // LinkedList -> Frequent update/delete
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<Integer>();

      list.add(5);
      list.add(15); 
      list.add(3);
      list.add(10);
      list.add(9);

      int data = list.get(1);
      System.out.println("Data at index 1: " + data);

      // list.remove(1);
      // Integer a = Integer.valueOf(9);
      // list.remove(a);

      System.out.println(list.contains(10));
      // 
      list.set(1, 11);

      // Traversing
      for (Integer d : list) {
        System.out.println(d);
      }
      // Travering using iterator
      Iterator<Integer> it = list.iterator();
      while (it.hasNext()) {
        System.out.println(it.next());
      }
      System.out.println(list);
    }
}