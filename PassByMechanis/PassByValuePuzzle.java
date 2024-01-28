class PassByValuePuzzle {
	public static void main(String[] args) {
		int ans = Num.f1();
		System.out.println("ANS=" + ans);
	}
}
class Num {
	int x = 5;
	int y = 20;
	static int f1() {
		int x = 10;
		Num n1 = new Num();
		f2(n1, x);
		return n1.x + n1.y;
	}

	static void f2(Num n2, int y) {
		y = y + n2.y;
		n2.y = n2.x + y;
		n2.x = n2.y + n2.x;
	}
}