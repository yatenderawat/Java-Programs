package assignments;

import java.util.Scanner;
/*Assignment 32 & 33
WAP to print Area & Perimeter of Triangle using Scanner Class*/

public class Triangle_Assignment_32_33 {
	static int h;
	static int b;
	static int side;
	// final static double pi = Math.PI; // Non-static

	static void areaOfTriangle() {
		System.out.print("Area of Triangle is ");
		System.out.println((h * b) / 2);
	}

	static void perimeterOfTriangle() {
		System.out.print("Perimeter of Triangle is ");
		System.out.println(h + b + side);
	}

	public static void main(String[] args) {
		System.out.println("Enter the height of Triangle");
		Scanner s1 = new Scanner(System.in);
		h = s1.nextInt();
		System.out.println("Enter the base of Triangle");
		b = s1.nextInt();
		System.out.println("Enter the third side of Triangle");
		side = s1.nextInt();
		areaOfTriangle();
		perimeterOfTriangle();
		s1.close();
	}
}
