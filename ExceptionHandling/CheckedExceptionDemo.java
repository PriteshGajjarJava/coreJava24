//Option 2 of handling chekced exception => Ignoring Checked Exception by writing "throws" in signature

import java.io.*;
class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException {
      System.out.println("Enter name:");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String name = br.readLine(); 
      System.out.println("Your name is: " + name);
    }
}

// public String readLine() throws IOException {}


