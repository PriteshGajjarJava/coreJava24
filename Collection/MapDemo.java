import java.util.*;
import java.util.Map;
import java.util.Set;

class MapDemo {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    // {1=One, 18=Eighteen, 7=Seven, 10=Ten, 14=Fourteen}
    map.put(18, "Eighteen");
    map.put(14, "Fourteen");
    map.put(1, "One");
    map.put(7, "Seven");
    map.put(10, "Ten");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter ID:");
    // int id = sc.nextInt();
    // System.out.println("Enter Name:");
    // String name = sc.next();
    // map.put(id,name);

    System.out.println("information of key 7 is: " + map.get(7));

    Set<Integer> keys = map.keySet();
    for (Integer key : keys) {
      System.out.println(key + "=>" + map.get(key));
    }
    map.put(10, "TEN"); // update
    map.remove(7);
    map.put(null, "null");
    System.out.println(map);
  }
}