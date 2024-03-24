// WAP using multi-threading which does addition of numbers from 1 to 100 (10 threads doing addtion in different ranges)
class AdditionThreadDemo {
    public static void main(String[] args) {
      AdditionThread[] t = new AdditionThread[10];

      for (int i=0; i<10; i++) {
        t[i] = new AdditionThread(i*10 + 1, (i+1)*10 );
        t[i].start();
      }

      int ans = 0;
      for (int i=0; i<10; i++) {
        try {
          t[i].join();
        }catch(InterruptedException e) {}

        ans = ans + t[i].sum;
      }
      System.out.println("Answer is: " + ans);
    }
}

class AdditionThread extends Thread {
  int sum;
  int start;
  int end;
  AdditionThread(int start, int end) {
    this.start = start;
    this.end = end;
  }
  @Override
  public void run() {
    for (int i=start; i<=end; i++) {
      this.sum = this.sum + i;
    }
    System.out.println(Thread.currentThread().getName() + "=>" + sum);
  }
}