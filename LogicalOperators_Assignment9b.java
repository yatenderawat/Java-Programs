package assignments;

public class LogicalOperators_Assignment9b {

	static void operator2() {
		int a = 50;
		int b = 150;
		double c = 200.50;

		if (!(a > b && b > c)) {
			// (! (false && false)) = true
			System.out.println("Not-AND block executed");
		}

		if (!(a < b || b > c)) {
			// (! (true || false)) = false
			System.out.println("Not-OR block executed");
		}
	}

	public static void main(String[] args) {
		operator2();

	}

}
