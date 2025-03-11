package assignments;
/*Assignment 29
WAP to print -5 to -15 using for loop*/

public class Loop3_Assignment29 {
	static int i;

	void forLoop3() {
		for (i = -5; i >= -15; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Loop3_Assignment29 l2 = new Loop3_Assignment29();
		l2.forLoop3();
	}

}
