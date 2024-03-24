class Test {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    String threadName = t.getName();
    System.out.println("Deafult thread is: " + threadName);
  }
}