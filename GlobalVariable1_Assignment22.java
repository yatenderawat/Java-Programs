package assignments;
/*Assignment 22
WAP to update static and non static global variable*/

public class GlobalVariable1_Assignment22 {

	int global1 = 10;
	static int global2 = 20;
	final static int global3 = 30;
	final int global4 = 40;

	static void globalMethod() {
		int global3 = 3000;
		System.out.println(global3);
	}

	public static void main(String[] args) {
		GlobalVariable1_Assignment22 g1 = new GlobalVariable1_Assignment22(); // create object for calling non-static
																				// variable inside static method
		/*
		 * int globalUpdate= g1.global1=100; System.out.println(globalUpdate);
		 */
		System.out.println(g1.global1); // print the global variable
		System.out.println(g1.global1 = 1000); // update and print the global variable
		System.out.println(global2); // print the static global variable
		System.out.println(global2 = 2000); // update the non-static global variable
		System.out.println(global3); // print the final global variable
		int global3 = 3000; // declare & initialize local variable with same name as global variable
		System.out.println(global3); // print local variable same name as global variable
		System.out.println(g1.global4); // print the final non-static variable
		int global4 = 4000; // declare & initialize local variable with same name as global variable
		System.out.println(global4); // print local variable same name as global variable
	}
}
