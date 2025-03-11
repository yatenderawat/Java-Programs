package assignments;
/*Assignment 39
WAP on Single Level Inheritance*/

class Parent_SLI {
	void parentSLI() {
		System.out.println("Parent SLI");
	}

}

public class SLI_Assignment39 extends Parent_SLI {
	void childSLI() {
		System.out.println("Child SLI");
	}

	public static void main(String[] args) {
		SLI_Assignment39 sli = new SLI_Assignment39();
		sli.parentSLI();
		sli.childSLI();
	}
}
