package assignments;
/*Assignment 83
WAP to count the number of alpahebets, numeric letters,spaces 
and special characters used in the given String  */

public class Assignment83 {
	public static void main(String[] args) {
		String s = "Yat2 || Yatendra # Singh @ Rawat 003*";
		int count_of_alphabet = 0;
		int count_of_digit = 0;
		int count_of_space = 0;
		int count_of_specialCharacter = 0;
		char[] char_of_string = s.toCharArray();
		System.out.println("Total number of char in given string is:" + s.length());

		for (int i = 0; i < char_of_string.length; i++) {
			boolean b1 = Character.isAlphabetic(char_of_string[i]);
			boolean b2 = Character.isDigit(char_of_string[i]);
			boolean b3 = Character.isWhitespace(char_of_string[i]);

			if (b1 == true) {
				count_of_alphabet++;
			}
			if (b2 == true) {
				count_of_digit++;
			}

			if (b3 == true) {
				count_of_space++;
			}
		}
		System.out.println("Total no. of alphabet in string is:" + count_of_alphabet);
		System.out.println("Total no. of digit in string is:" + count_of_digit);
		System.out.println("Total no. of spaces in string is:" + count_of_space);
		count_of_specialCharacter = char_of_string.length - (count_of_alphabet + count_of_digit + count_of_space);
		System.out.println("Total no. of special character in string is:" + count_of_specialCharacter);
	}
}
