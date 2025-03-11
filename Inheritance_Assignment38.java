package assignments;

//Parent class
class ChildClass {
	static void sub() {
		System.out.println("Subtract program");

	}

}

//Child class -> Child class should be public and 
public class Inheritance_Assignment38 extends ChildClass {
	static void add() {
		System.out.println("Adding program");

	}

	public static void main(String[] args) {
		sub();
		add();
	}

}
