package assignments;
/*Assignment 53
WAP on Multiple Level Inheritance */

interface Parent04 {
	void add2();
}

interface Parent05 {
	void sub2();
}

class Implement2 implements Parent04, Parent05 {
	public void add2() {
		System.out.println("This is add method");
	}

	public void sub2() {
		System.out.println("This is sub method");
	}
}

public class Assignment53 {
	public static void main(String[] args) {

		Implement2 a = new Implement2();
		a.add2();
		a.sub2();
	}
}
