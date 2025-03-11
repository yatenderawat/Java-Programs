package assignments;
/*Assignment 52
WAP on Multi Level Inheritance using Interface Concept*/

interface Parent01 {
	void add();
}

interface Parent02 extends Parent01 {
	void sub();
}

interface Parent03 extends Parent02 {
	void div();	
}

class Implementation implements Parent03 {
	public void add() {
		System.out.println("Add of 2 Numbers");

	}

	public void sub() {
		System.out.println("Subtraction of 2 Numbers");
	}

	public void div() {
		System.out.println("Division of 2 Numbers");
	}
}

public class Assignment52  {
	public static void main(String[] args) {
		Implementation a1 = new Implementation();
		a1.add();
		a1.sub();
		a1.div();
	}
}
