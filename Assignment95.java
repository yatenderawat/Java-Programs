package assignments;

import java.util.HashSet;
import java.util.Set;

/*Assignment 95
"WAP on Set concepts using its methods"*/

public class Assignment95 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		System.out.println("Below is the list of SET");
		// Adding elements to the SET
		s1.add("Lion");
		s1.add("Tiger");
		s1.add("Zebra");
		System.out.println(s1);
		// Removing the element from SET
		s1.remove("Lion");
		System.out.println("Below is the List of SET, After removing 1 element");
		System.out.println(s1);
		// Verifying the SET is empty or not
		System.out.println("Does the List is empty: " + s1.isEmpty());
		// Removing all the elements from the SET
		System.out.println("Removing all the elements from the SET");
		s1.removeAll(s1);
		System.out.println(s1);
	}
}
