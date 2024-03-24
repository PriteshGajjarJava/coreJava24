public class ProducerConsumer {
    public static void main(String[] args) {
      Object obj = new Object();

      ConsumerThread t2 = new ConsumerThread(obj);
      t2.start();

      ProducerThread t1 = new ProducerThread(obj);
      t1.start();
    }
}
// Pen producer
class ProducerThread extends Thread {
  int productionCount = 0;
  Object obj;
  ProducerThread(Object obj) { this.obj = obj;}
  @Override
  public void run() {
    while (productionCount != 100) {
      System.out.println("Pen " + (productionCount+1) + " is ready");
      productionCount++;
      if (productionCount % 10 == 0) {
        synchronized(obj) {
          try { Thread.sleep(500); } catch(InterruptedException e) {}
          System.out.println("***NOTIFYING***");
          obj.notify();
        }
      }
    }
    try {
      System.out.println("Waiting for coluring job to complete...");
    Thread.sleep(1000);
    }catch(InterruptedException e) {}
    synchronized(obj) {
      obj.notifyAll();
    }

  }
}
// Pen coloring thread
class ConsumerThread extends Thread {
  int coloredCount = 0;
  Object obj;
  ConsumerThread(Object obj) { this.obj = obj;}

  @Override
  public void run() {
    while (coloredCount != 100) {
      try {
        synchronized(obj) {
          obj.wait();
        }
      }catch(InterruptedException e) {}
      for (int i=1;i<=15;i++) {
        if (coloredCount < 100) {
          System.out.println("Pen " + (coloredCount+1) + " is colored");
          coloredCount++;
        }
      }
    }  
  }
}