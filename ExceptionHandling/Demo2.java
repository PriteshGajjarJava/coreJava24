// java Demo2
// java Demo2 JAVA
// java Demo2 5

class Demo2 {
  public static void main(String[] args) {
    String s = null;
    int[] arr = {10,20,30,40,50,60,70};
    try {
      System.out.println(arr[args.length]);//10
      System.out.println(arr[args[0].length()]);
      System.out.println(arr[3]/Integer.parseInt(args[0]));
      System.out.println(s.length());
    }catch(ArrayIndexOutOfBoundsException e1) {
      System.out.println("AIOOBE");
    }catch(NullPointerException e2) {
      System.out.println("NPE");
    }finally {
      System.out.println("Finally");
    }
    System.out.println("DONE");
  }
}