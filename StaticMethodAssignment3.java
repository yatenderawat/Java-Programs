package assignments;

// Calling Static Methods inside main() Method

public class StaticMethodAssignment3 {

	static void Addition() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	static void Subtraction() {
		int a = 10;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	static void Multiplication() {
		int a = 10;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	static void Divide() {
		int a = 10;
		int b = 20;
		int div = a/b;
		System.out.println(div);
	}

	static void Modulas() {
		int a = 10;
		int b = 20;
		float mod = a%b;
		System.out.println(mod);
	}

	public static void main(String[] args) {
		Addition();
		Subtraction();
		Multiplication();
		Divide();
		Modulas();

	}

}
