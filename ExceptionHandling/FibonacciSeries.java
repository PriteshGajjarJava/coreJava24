public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    // Method to generate and print Fibonacci series
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        // Print the first two terms
        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
