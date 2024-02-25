class AddNumbersUsingCommandLine {
    public static void main(String[] args) {
      // First check count of arguments
      if (args.length < 2) {
        System.out.println("Please pass two numbers");
        System.exit(0);
      }

      int a = Integer.parseInt(args[0]); // String to int
      int b = Integer.parseInt(args[1]); 
      int c = a + b;
      System.out.println("Answer is: " + c);
    }
}