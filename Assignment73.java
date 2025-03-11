package assignments;

import java.util.Scanner;

/*Assignment 73
WAP on String Function using toCharArray concept*/

public class Assignment73 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		// sc.nextLine() reads the entire line, which is better for handling complete
		// sentences.
		String input = sc.nextLine();
		char[] input1 = input.toCharArray();
		System.out.println("Given input length is: " + input1.length);
		for (int i = 0; i < input1.length; i++) {

			System.out.print(input1[i]);
		}
		sc.close();
	}
}
