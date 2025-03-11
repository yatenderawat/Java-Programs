package assignments;

import java.util.Arrays;
import java.util.Scanner;

/*Assignment 80
WAP on Array Function using Arrays.toString and Arrays.sort concept
Assignment 82
WAP to find out if the given 2 strings are anagram                
*/

public class Assignment82 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Two strings at run time
		System.out.println("Enter the first Input");
		String firstInput = sc.next().toLowerCase();
		System.out.println("Enter the second Input");
		String secondInput = sc.next().toLowerCase();
		sc.close();

		// convert string to char[] array
		char[] firstInputChar = firstInput.toCharArray();
		char[] secondInputChar = secondInput.toCharArray();

		// checking if 2 strings length are same or not
		if (firstInput.length() != secondInput.length()) {
			System.out.println("Given two strings are not Anagram");
		}

		else {
			// Sorting two char arrays
			Arrays.sort(firstInputChar);
			Arrays.sort(secondInputChar);

			// check if two arrays are equals or not
			if (Arrays.equals(firstInputChar, secondInputChar)) {
				System.out.println("Given two strings are Anagram");
			} else {
				System.out.println("Given two strings  are not Anagram");
			}
		}
	}
}
