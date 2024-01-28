class Demo1 {
	int x;
	static {
		System.out.println("ONE");
	}

	{
		System.out.println("TWO");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();
	}

	{
		System.out.println("THREE");
	}
}