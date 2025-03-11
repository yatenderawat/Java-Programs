package assignments;

import java.util.LinkedList;
import java.util.List;

/*Assignment 89
WAP on collection concept with the help of Upcasting on 
Different Data types (Int, Char, Double, string etc.) 
with different methods like Add, Remove, Contains.
Assignment 90
WAP on While loop*/

public class Assignment89 {
	public static void main(String[] args) {
		// adding elements to list
		List<Object> l1 = new LinkedList<>();
		l1.add("Yatendra"); // String
		l1.add(25); // Int
		l1.add(30.05); // Double
		l1.add('Y'); // Char
		System.out.println("The list of collection is: " + l1);
		// removing element
		l1.remove(2);
		System.out.println("After removing the element: " + l1);
		
		// while loop
		while (l1.size() > 2) {
			System.out.println("The size of the Collection is: " + l1.size());

			// contains
			System.out.println("Does the list contain int 25: " + l1.contains(25));
			break;
		}
	}
}
