import java.util.LinkedList;
import java.util.Queue;


class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(5);
    queue.add(15);
    queue.add(52);
    queue.add(4);

    int d = queue.poll();// get head of the queue and remove it
    int top = queue.peek();// returns first element of the queue
    System.out.println(d);
    System.out.println(top);
  }
}