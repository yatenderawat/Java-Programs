package assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Assignment 91
"WAP to iterate a Collection using Iterator
*/

public class Assignment91 {
	public static void main(String[] args) {

		// Adding the elements to the list
		List<Object> list = new ArrayList<>();
		list.add("Yatendra");
		list.add("Singh");
		list.add("Rawat");
		list.add(26);
		list.add(35256.26);
		list.add('Y');

		// Iterating over the list of elements
		Iterator<Object> itr = list.iterator();
		System.out.println("Iterating over the list:");

		// While condition
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
