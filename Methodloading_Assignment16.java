package assignments;

/*"Assignment 16 
WAP for Method overloading for static and non static method. "
*/
public class Methodloading_Assignment16 {

	static void MethodOverlod() {

		System.out.println("1st Static Method called");
	}

	static void MethodOverlod(int b, String s, char c) {

		System.out.println("2nd Static Method called");
	}

	void MethodOverload() {
		System.out.println("1st Non static Method called now.");
	}

	void MethodOverload(int b, double d) {
		System.out.println("2nd Non static Method called now.");
	}

	public static void main(String[] args) {
		MethodOverlod();
		MethodOverlod(100, "Yatender", 'Y');
		Methodloading_Assignment16 a = new Methodloading_Assignment16();
		/*
		 * a.MethodOverload(); will call the non-static method MethodOverload() because
		 * a is an object of the Methodloading_Assignment16 class, and non-static
		 * methods are called on instances (objects) of the class.
		 */
		a.MethodOverload();
		a.MethodOverload(10, 10.56);

	}

}
