package assignments;
/*Assignment 70
WAP to reverse a string*/

public class Assignment70 {
	public static void main(String[] args) {
		String name = "ICC World Championship";
		String reverse = "";
		System.out.println(name);
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			reverse = reverse + c;
		}
		System.out.println("After reversing the string: " + reverse);
	}

}
