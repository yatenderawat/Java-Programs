package assignments;

/*"Assignment 15
WAP with combination of 3 static parameterized methods and try calling try calling them inside main method"
*/
public class StaticParameterMethod_Assignment15 {

	static void add(int a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	static void mult(float a, float b) {
		float mul = a * b;
		System.out.println(mul);
	}

	static void all(String s, char b, boolean c, float d) {
		//System.out.println(s ,b ,c, d);
	}

	public static void main(String[] args) {
		add(10, 0.877);
		mult(50.12f, 10.21f);
		all("YAT2", 'Y', true, 20.5f);
	}

}
