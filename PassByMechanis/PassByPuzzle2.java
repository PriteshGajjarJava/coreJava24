class PassByPuzzle2 {
	int x = 10;
	public static void main(String[] args) {
		int x = 20;
		PassByPuzzle2 obj = new PassByPuzzle2();
		fun(x, obj);
		System.out.println("x=" + x +", obj.x=" + obj.x);
	}

	static void fun(int x, PassByPuzzle2 obj) {
		x = x + 30;
		obj.x = x + 10;
	}
}
