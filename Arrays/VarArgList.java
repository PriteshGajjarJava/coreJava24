class VarArgList {
    public static void main(String... args) {
      System.out.println(add());
      System.out.println(add(1,2));
      System.out.println(add(1,2,3,4));
      System.out.println(add(1,2,3,4,4,5,6,6,7,7,8,3,5,6,3));

    }

    // This can take 0 to n number of comma seperated int values 
    static int add(int ...a) {
      int sum = 0;
      for (int i=0; i < a.length; i++) {
        sum = sum + a[i];
      }
      return sum;
    }
}