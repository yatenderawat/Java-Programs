package assignments;
/*Assignment 45
WAP on method overriding*/

class Parent5{
	void add() {
		System.out.println("Add method from Parent class");
	}
}

public class MethodOverride extends Parent5 {
	//Method overridden
	void add() {
		System.out.println("Add method from Child class");
	}
	
	public static void main(String[] args) {
		MethodOverride m= new MethodOverride();
		m.add();
	}

}
