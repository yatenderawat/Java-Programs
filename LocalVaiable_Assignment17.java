package assignments;
/*WAP to declare a variable inside a static and non static  Method. For local varable.*/

public class LocalVaiable_Assignment17 {

	static void add() {
		// local variable inside static method
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

	void sub() {
		// local variable inside non-static method
		int a = 100;
		int b = 200;
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add();
		LocalVaiable_Assignment17 l = new LocalVaiable_Assignment17();
		l.sub();

	}

}
