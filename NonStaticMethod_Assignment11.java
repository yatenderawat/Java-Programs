package assignments;

public class NonStaticMethod_Assignment11 {

	/*
	 * "Assignment 11: WAP to call one non static method in the main method"
	 */

	void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	void multiply() {
		int a = 10;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	void subtract() {
		int a = 10;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		NonStaticMethod_Assignment11 a = new NonStaticMethod_Assignment11();
		NonStaticMethod_Assignment11 b = new NonStaticMethod_Assignment11();
		a.add();
		b.multiply();
		a.subtract();

	}

}
