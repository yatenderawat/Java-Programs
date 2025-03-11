package assignments;

public class ConstructorOverloading_Assignment19 {
	/*
	 * "Assignment 19 WAP on Constructor Overloading"
	 */

	ConstructorOverloading_Assignment19() {
		System.out.println("1st constructor called");
	}

	ConstructorOverloading_Assignment19(int a) {
		System.out.println("2nd constructor called");
	}

	ConstructorOverloading_Assignment19(int a, String b, char c, double d) {
		System.out.println("3rd constructor called");
	}

	public static void main(String[] args) {
		// creating an object and calling the constructor at a same time
		new ConstructorOverloading_Assignment19();
		new ConstructorOverloading_Assignment19(10);
		new ConstructorOverloading_Assignment19(10, "Yatender", 'Y', 30.36);
		// below is just creating an object
		ConstructorOverloading_Assignment19 a = new ConstructorOverloading_Assignment19();
		// a.ConstructorOverloading_Assignment19();

	}

}
