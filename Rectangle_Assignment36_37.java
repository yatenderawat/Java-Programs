package assignments;

import java.util.Scanner;

public class Rectangle_Assignment36_37 {

	static void areaOfRectangle(double length, double bredth) {
		// Area of rectangle = l*b
		System.out.println("Area of Rectangle is: ");
		double areaRectangle = length * bredth;
		System.out.println(areaRectangle);
	}

	static void perimeterOfRectangle(double length, double bredth) {
		// perimeter of rectangle = 2(l+b)
		System.out.println("Perimeter of Rectangle is: ");
		double perimeterRectangle = 2 * (length + bredth);
		System.out.println(perimeterRectangle);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double length = s1.nextDouble();
		System.out.println("Enter the length of rectangle");
		double bredth = s1.nextDouble();
		areaOfRectangle(length, bredth);
		perimeterOfRectangle(length, bredth);
		s1.close();
	}

}
