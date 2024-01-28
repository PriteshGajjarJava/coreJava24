class NestedFuncCall {
	public static void main(String[] args) {
		int a = 10;
		int res = f1(a);
		System.out.println(res);
	}

	static int f1(int b) {
		b = b + 20;
		int c = f2(b);
		return c * 2;
	}

	static int f2(int x) {
		x = x + 10;
		return x * 5;
	}
}