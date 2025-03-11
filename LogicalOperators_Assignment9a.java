package assignments;

public class LogicalOperators_Assignment9a {

	static void add() {
		int a = 25;
		double b = 85.6;
		int c = 55;
		int d = 12;
		// true && true
		if (a > d && a < b) {
			double sum = a + b;
			System.out.println(sum);
		}
		// true && true = true
		if (d < a && a < c) {
			System.out.println("First IF condition executed");
		}

		// false || false = false
		if (c > b || a > c) {
			System.out.println("Second IF condition executed");
		}

		// false || true = true
		if (b < c || b > c) {
			System.out.println("Third IF condition executed");
		}

		// true && false = false
		if (c > d && c > b) {
			System.out.println("Fourth IF condition executed");

		}

	}

	public static void main(String[] args) {
		add();

	}

}
