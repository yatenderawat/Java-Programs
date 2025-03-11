package assignments;

/*Assignment 87
WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace
*/
public class Assignment87 {
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Yatendra");

		// append method
		System.out.println("Below is the append method output:");
		str.append(" Singh").append(" Rawat");
		System.out.println(str);

		// insert method
		System.out.println("Below is the insert method output:");
		str.insert(8, " insert");
		System.out.println(str);

		// delete method
		System.out.println("Below is the delete method output:");
		// delete method -> delete endIndex, endIndex-1
		str.delete(3, 5);
		System.out.println(str);

		// substring
		String subString = str.substring(3, 8);
		// endIndex, endIndex-1
		System.out.println("The substring of the String is : " + subString);

		// reverse
		System.out.println("Reverse stringBuffer is: " + str.reverse());

		// capacity
		System.out.println("The capacity of StringBuilder is : " + str.capacity());

		// replace

		System.out.println("Given output from replace method: " + str.replace(0, 5, "Yattu"));
	}
}
