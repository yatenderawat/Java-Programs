package assignments;
/*Assignment 88
WAP on constructors of a String Buffer and constructors of a String Builder*/

public class Assignment88 {
	public static void main(String[] args) {

		/*
		 * // first constructor StringBuffer str1 = new StringBuffer();
		 * System.out.println("First constructor capacity: " + str1.capacity());
		 * 
		 * // second constructor StringBuffer str2 = new StringBuffer("Yattu");
		 * System.out.println("Second constructor capacity: " + str2.capacity());
		 * 
		 * // third constructor StringBuffer str3 = new StringBuffer(30);
		 * str3.append("Yatendra Singh Rawat");
		 * System.out.println("Second constructor capacity: " + str3.capacity());
		 */
		
		String s1= "hello";
		s1= s1.substring(1,3);
		s1= s1.concat(" world");
		System.out.println(s1);
	}
}
