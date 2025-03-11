package assignments;

/*"Assignment 14
WAP with combination of 4 non static parameterized methods and try calling them inside main method"
*/
public class ParameterizedMethod_Assignment14 {

	void add(int a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	void subtract(double a, double b) {
		double sub = a - b;
		System.out.println(sub);
	}

	void multiply(double a, int b) {
		double mul = a * b;
		System.out.println(mul);
	}

	void divide(int a, float b) {
		float div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		ParameterizedMethod_Assignment14 para = new ParameterizedMethod_Assignment14();
		ParameterizedMethod_Assignment14 para1 = new ParameterizedMethod_Assignment14(); // calling second reference variable 'para1'
		para.add(5, 100.55);
		para1.subtract(13, 19); // called by second reference variable
		para.multiply(405.65, 700);
		para1.divide(80, 14.58f); // called by second reference variable
	}
}
