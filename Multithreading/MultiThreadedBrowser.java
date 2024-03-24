public class MultiThreadedBrowser {
  public static void main(String[] args) {
    PrintingThread t1 = new PrintingThread();
    t1.start();

    StreamingThread job = new StreamingThread();
    Thread t2 = new Thread(job);
    t2.start();
  
    for (int i=1; i <=100 ; i++) {
      System.out.println("Browsing " + i + "%");
    }
  }
}
// option-1
class PrintingThread extends Thread {
  @Override
  public void run() {
    for (int i=1; i <=100 ; i++) {
      System.out.println("Printing " + i + "%");
    }
  }
}
//option-2
class StreamingThread implements Runnable {
  @Override
  public void run() {
    for (int i=1; i <=100 ; i++) {
      System.out.println("Streaming " + i + "%");
    }
  }

}

