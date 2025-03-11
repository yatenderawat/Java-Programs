package assignments;
/*
 * "Assignment 13: WAP with combination of static and non static methods and try
 * calling both of them"
 */

public class CombinationStaticNonStatic_Assignment13 {

	static void add() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
	}

	void sub() {
		int a = 200;
		int b = 50;
		int sub = a - b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		add();
		CombinationStaticNonStatic_Assignment13 a = new CombinationStaticNonStatic_Assignment13();
		a.sub();

	}

}
