// StringBuffer   - Synchronized    
// StringBuilder  - Not Synchronized   

class StringBufferDemo {
    public static void main(String[] args) {
      StringBuffer s1 = new StringBuffer("Today is Sunday");

      s1.insert(9, "Last ");
      s1.replace(0, 5, "TODAY");

      s1.delete(s1.indexOf("Last"), s1.indexOf("Last") + 5);

      s1.reverse();// yadnuS si YADOT

      String input = "Hello String!";
      String output = reverse(input);
      System.out.println(output);  
    }

    static String reverse(String str) {
      // String into StringBuffer
      StringBuffer buf = new StringBuffer(str);
      buf.reverse();
      // StringBuffer into String
      return buf.toString();
    }


}

