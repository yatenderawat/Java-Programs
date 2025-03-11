package assignments;

public class Abstract2 extends Abstract1 {
	void add() {
		System.out.println("This is add method");
	}

	void mul() {
		System.out.println("This is mul method");
	}
	

	public static void main(String[] args) {
		Abstract2 a = new Abstract2();
		a.add();
		a.mul();
		a.sub();
	}

}
