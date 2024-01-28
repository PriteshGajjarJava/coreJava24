import java.util.Scanner;
class NumberNames {
  public static void main(String[] args) {
	// Read input from user
	System.out.println("Enter number between 1 to 10");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	String output = getNumberName(n);
	System.out.println(n + "=>" + output);
  }

  static String getNumberName(int n) {
	String[] numNames = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven","Twelve"};
	return n>=1 && n<=numNames.length ? numNames[n-1] : "Not Found";
  }
}
