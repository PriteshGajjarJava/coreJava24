class Puzzle1 {
	public static void main(String[] args) {
		int ans = Num.puzzleMe();
		System.out.println("Ans is : " + ans);
	}
}

class Num {
	int a = 10;
	static int puzzleMe() {
		int a = 20;
		Num n1 = new Num();
		n1.a = 20;
		Num n2 = new Num();
		return a + n1.a + n2.a;
	}
}