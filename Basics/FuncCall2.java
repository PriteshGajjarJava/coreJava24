class FuncCall2 {
	public static void main(String[] args) {
		int x = 10, y=20;
		int z = f1(x,y);
		System.out.println(z);
	}

	static int f1(int a, int b) {
		int x = a + b;
		int y = x + a;
		return f2(x,y) + b;
	}
	static int f2(int x, int y) {
		int a = x + y;
		return a + y;
	}
}