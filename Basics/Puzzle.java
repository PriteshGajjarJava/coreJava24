class Puzzle {
	int x = 9;

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);		// 10

		Puzzle p1 = new Puzzle();
		System.out.println(p1.x);	// 9

		Puzzle p2 = new Puzzle();
		p2.x = 50;
		System.out.println(p2.x); 	// 50
	}
}