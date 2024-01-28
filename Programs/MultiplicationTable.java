import java.util.Scanner;

class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTable(n);

	}

	static void printTable(int num) {
		for (int i=1; i <=10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}
}