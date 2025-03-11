package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Assignment 96: WAP to iterate a Set using Iterator

public class Assignment96 {

	public static void main(String[] args) {
		Set<Object> s2 = new HashSet<>();
		s2.add("Hritik");
		s2.add(48);
		s2.add("Katrina");
		s2.add(39);
		s2.add("Govinda");
		s2.add(52);
		Iterator<Object> itr = s2.iterator();

		while (itr.hasNext()) {
			Object nextElement = itr.next();
			System.out.println(nextElement);
		}
	}
}
