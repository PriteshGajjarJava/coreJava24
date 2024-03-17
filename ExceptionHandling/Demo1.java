class Demo1 {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a/b);
      System.out.println("Try end");
    }catch(ArithmeticException e1) {
      System.out.println("AE");
    }
    catch(ArrayIndexOutOfBoundsException e2) {
      System.out.println("AIOOB");
    }
    catch(Exception e3) {
      System.out.println("Exception");
    }finally {
      System.out.println("Finally");
    }
    System.out.println("DONE");
  }
}
// java Demo1 20 4 - SUCCESS
// java Demo1 -> ArrayIndexOutOfBoundsException on line 3
// java Demo1 5 -> ArrayIndexOutOfBoundsException on line 4
// java Demo1 twenty 2 -> NumberFormatException on line 3
// java Demo1 20 0 -> ArithmeticException on line 5 (Divide by 0)

