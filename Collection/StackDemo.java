import java.util.*;
import java.util.Stack;
class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    stack.push(8);
    stack.push(18);
    stack.push(0);
    stack.push(9);
    stack.push(4);

    int d = stack.pop();
    int d1 = stack.peek();
    System.out.println("popped element is:" + d);
    System.out.println("d1=" + d1);
    System.out.println(stack);

    Iterator<Integer> it = stack.iterator();
    while(it.hasNext()) { System.out.println(it.next());}
  }
}