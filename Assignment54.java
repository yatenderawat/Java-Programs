package assignments;
/*Assignment 54
WAP on Access specifiers within class for methods*/

public class Assignment54 {
	// public method- access from anywhere
	public void add() {
		System.out.println("This is add method");
	}

	// within class, package, outside package becoming subclass
	protected void sub() {
		System.out.println("This is sub method");
	}

	// within class, inside package
	void div() {
		System.out.println("This is div method");
	}

	// within class only
	private void mul() {
		System.out.println("This is mul method");
	}

	public static void main(String[] args) {
		Assignment54 a2 = new Assignment54();
		a2.add(); // Public: Accessible anywhere
		a2.sub(); // Protected: Accessible within class
		a2.div(); // Default: Accessible within class
		a2.mul(); // Private: Accessible within class only
	}
}
