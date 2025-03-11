package assignments;

/*Assignment 41
WAP on Hierarchical Level Inheritance
Assignment 43
"WAP on super calling
statement using
parameterized
super calling statement"
*/
class Parent {
	Parent(char c, String s) {
		System.out.println("This is the Parent class");
	}
}

class Child extends Parent {
	Child(int a, double b) {
		super('Y', "Yatender"); // super class-> Explicitly bcz parent class is parameterized
		System.out.println("This is Child 2 class");
	}
}

public class HierarchalInheritance_Assignment41 extends Parent {

	HierarchalInheritance_Assignment41() {
		super('R', "Rawat");
		System.out.println("This is child 1 class");
	}

	public static void main(String[] args) {
		new HierarchalInheritance_Assignment41();
		new Child(5, 30.5);
	}
}
