package assignments;

/*Assignment 42
"WAP on super calling statement using non-parameterized
super calling statement"
*/
class Parent3 {
	Parent3() {
		System.out.println("This is Parent class3");
	}
}

class Parent4 extends Parent3 {
	Parent4() {
		/*
		 * super calling statement is called implicitly in this line which is calling
		 * Paent3 constructor.
		 */
		System.out.println("This is Parent class4");
	}
}

public class SuperNonParameterized extends Parent4 {
	/*
	 * super calling statement is called implicitly in this line which is calling
	 * Paent4 constructor.
	 */
	SuperNonParameterized() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		new SuperNonParameterized();
	}

}
