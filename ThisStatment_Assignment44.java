package assignments;
/*Assignment 44
"WAP on this calling statement"*/

public class ThisStatment_Assignment44 {
	ThisStatment_Assignment44() {
		this(30.56);
		System.out.println("This is This1 constructor called.");
	}

	ThisStatment_Assignment44(double d) {
		this("Yatendra");
		System.out.println("This is This2 constructor called.");
	}

	ThisStatment_Assignment44(String s) {
		System.out.println("This is This3 constructor called.");
	}

	public static void main(String[] args) {
		new ThisStatment_Assignment44();

	}

}
