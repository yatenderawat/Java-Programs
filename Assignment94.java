package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment94 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Grapes");
		System.out.println("Below is the elements list:");
		System.out.println(list);

		ListIterator<String> listItr = list.listIterator();
		// Iterate in forward direction

		System.out.println("Iterate in Forward direction:");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		// Iterate in backward direction
		System.out.println("Iterate in Backward direction:");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}

}
