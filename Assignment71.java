package assignments;

import java.util.Scanner;
/*Assignment 71
WAP to check if the given string is a Palindrome?*/

public class Assignment71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check, if it is palindrome or not..");
		String name = scan.next();
		scan.close();
		String reverse = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}

		boolean checkPalindrome = reverse.equalsIgnoreCase(name);
		if (checkPalindrome == true) {
			System.out.println("Given string is Palindrome");
		}

		else {
			System.out.println("Given string is not a Palindrome");
		}
	}
}
