package assignments;

import java.util.Scanner;

/*Assignment 34 & 35
WAP to print Area & Perimeter of Square using Scanner Class*/

public class Square_Assignment34_35 {

	static void areaOfSquare(int side) {
		System.out.print("Area of Square is ");
		System.out.println(side*side);
	}

	static void perimeterOfSquare(int side) {
		System.out.print("Perimeter of Square is ");
		System.out.println(4*side);
	}

	public static void main(String[] args) {
		System.out.println("Enter the side of Square");
		Scanner s1 = new Scanner(System.in);
		int side = s1.nextInt();
		areaOfSquare(side);
		perimeterOfSquare(side);
		s1.close();
	}
}
