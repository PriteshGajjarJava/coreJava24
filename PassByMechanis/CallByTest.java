class CallByTest {
	int a = 10;

	public static void main(String[] args) {
		int a = 20;
		CallByTest obj = new CallByTest();
		fun(a, obj);
		System.out.println("a=" + a);
		System.out.println("obj.a=" + obj.a);
	}

	static void fun(int a, CallByTest xyz) {
		a = a * 10;
		xyz.a = xyz.a * 10;
	}
}