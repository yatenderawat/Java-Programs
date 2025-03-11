package assignments;

import java.util.Scanner;

/*Assignment 75
Find out the average of all the numbers present in your array*/

public class Assignment75 {

	static int sum = 0;
	static double average = 0;

	static void averageOfNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the input:");
		int[] input = new int[sc.nextInt()]; //array of int
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("Enter the input below: ");
			input[i] = sc.nextInt();
			sum = input[i] + sum;
		}
		sc.close();
		System.out.println("The total of all given input is: " + (sum));
		System.out.println("The average of given input is: " + (average = sum / input.length));
	}

	public static void main(String[] args) {
		averageOfNumber();
	}
}
