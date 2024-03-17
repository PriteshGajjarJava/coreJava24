class NestingPuzzle1 {
  public static void main(String[] args) {
    try {
      System.out.println("try1 start");
      try {
        String s = args[0];
        if (s.length() % 3 == 0) {
          s = null;
        }
        System.out.println(s.length());
        System.out.println(10/(9/s.length()-4));
      }catch(NullPointerException e) {
        System.out.println("NPE");
      }finally {
        System.out.println("Finally 2");
      }
      System.out.println("try1 end");
    }catch(Exception e) {
      System.out.println("EXCEPTION");
    }finally {
      System.out.println("Finally1");
    }
    System.out.println("DONE");
  }
}
