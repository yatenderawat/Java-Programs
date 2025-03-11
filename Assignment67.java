package assignments;
/*Assignment 67
Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts*/

public class Assignment67 {

	public static void main(String[] args) {

		String name = "   Yatendra Singh Rawat   ";
		System.out.println(name);
		System.out.println("String in Upper case" + name.toUpperCase());
		System.out.println("String in Lower case" + name.toLowerCase());
		System.out.println("Length of String " + name.length());
		System.out.println("String character value at Index: " + name.charAt(12));
		System.out.println("String space trimmed from starting and last: " + name.trim());
	}

}
