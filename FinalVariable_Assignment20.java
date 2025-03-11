package assignments;

/*Assignment 20
WAP on Final Variable
 * Assignment 21
WAP for static and non static global variable
and utilize them in both static and non static methods
*/
public class FinalVariable_Assignment20 {
	static final int finalVariable = 100; // static final variable
	final int finalVariable1 = 500; // non-static final variable
	int nonStaticVariable = 200; // Non-static variable
	static int StaticVariable = 300; // Static variable

	void nonStaticMethod() { // Non-static method
		System.out.println(nonStaticVariable);
		System.out.println(StaticVariable);
	}

	static void staticMethod() { // Non-static method
		FinalVariable_Assignment20 f1 = new FinalVariable_Assignment20();
		System.out.println(f1.nonStaticVariable); // calling non-static variable inside static method
		System.out.println(StaticVariable); // calling Static variable inside static method
	}

	public static void main(String[] args) {
		FinalVariable_Assignment20 fin = new FinalVariable_Assignment20();
		fin.nonStaticMethod(); // calling Non-static method inside static method
		staticMethod(); // calling static method inside static method
		System.out.println(finalVariable); // print static final variable
		System.out.println(fin.finalVariable1); // print Non-static final variable

	}

}
