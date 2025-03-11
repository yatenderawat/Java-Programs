package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	static void addition() {
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the first value");
			int a = s1.nextInt();
			System.out.println("Enter the second value");
			int b = s1.nextInt();
			int c = a / b;
			System.out.println("The answer after dividing is: " + c);
			s1.close();
		}

		catch (ArithmeticException e) {
			System.out.println("Arithmetic Excception caught");
		}
		
		catch (InputMismatchException e) {
			System.out.println("InputMismatc Excception caught");
		}
	}
	
	static void method2() {
		System.out.println("Program continues...");
	}

	public static void main(String[] args) {
		addition();
		method2();
	}
}
