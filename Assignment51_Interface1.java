package assignments;

/*Assignment 51
WAP on Interface with 2 Abstract methods*/
interface Assignment51_Interface1 {
	void add();

	void sub();
}

class child1 implements Assignment51_Interface1 {
	public void add() {
		System.out.println("1. This is child class1 Method");
	}

	public void sub() {
		System.out.println("2. This is child class1 Method");
	}
}

abstract class Child2 implements Assignment51_Interface1 {
	abstract void mul(); // abstract method

	void div() { // concrete method
		System.out.println("This is div class- concrete methods");
	}

	public void add() {
		System.out.println("Child class 2 add method");
	}
}

class Child3 extends Child2 {
	public void sub() {
		System.out.println("Child3- Sub method");
	}

	public void mul() {
		System.out.println("Child3- mul method");
	}
}
