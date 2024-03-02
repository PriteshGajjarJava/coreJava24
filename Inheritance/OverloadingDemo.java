class OverloadingDemo {
    public static void main(String[] args) {
      OverloadingDemo.main("TEST");
      OverloadingDemo obj = new OverloadingDemo();
      System.out.println(obj.add(4,5));
      System.out.println(obj.add(4,5,10));
      System.out.println(obj.add("Good", "Morning"));
      System.out.println(obj.add(4,5.6f));
    }

    public static void main(String a) {
      System.out.println("Main -> " + a);
    }
    
    int add(int ...x) {
      int sum = 0;
      for (int i=0; i < a.length; i++) {
        sum = sum + a[i];
      }
      return sum; 
    }

    int add(int a, int b) {
      return a + b;
    }
    String add (String a, String b) {
      return a + b;
    }

    float add(int a, float b) {
      return a + b;
    }
}