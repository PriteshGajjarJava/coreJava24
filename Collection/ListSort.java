import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListSort {
    public static void main(String[] args) {
      List<String> cities = new ArrayList<String>();
      String[] data = {"Pune", "Goa", "Nashik", "Gujarat", "Nagpur"};
      cities = Arrays.asList(data);

      int max = Collections.max(Arrays.asList(8,1,4,11,3));
      System.out.println("MAx is: " + max);
      System.out.println(cities);
      Collections.sort(cities);
      System.out.println("After sorting:" + cities);
    }
}