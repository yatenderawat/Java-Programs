package assignments;

import java.util.Scanner;

/*Assignment 30 & 31
WAP to print Area & Circumference of Circle using Scanner Class*/

public class Circle_Assignment31 {
	static int r;
	final static double pi = Math.PI; // Non-static

	static void areaOfCircle() {
		System.out.print("Area of circle is ");
		System.out.println(pi * r * r);
	}

	static void circumferenceOfCircle() {
		System.out.print("Circumference of circle is ");
		System.out.println(2 * pi * r);
	}

	public static void main(String[] args) {
		System.out.println("Enter the radius of circle");
		Scanner s1 = new Scanner(System.in);
		r = s1.nextInt();
		areaOfCircle();
		circumferenceOfCircle();
		s1.close();
	}
}
