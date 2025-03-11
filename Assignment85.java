package assignments;

import java.util.Date;

/*Assignment 85
"WAP to find out the current date, past date and future date using String function"*/

public class Assignment85 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);

		// fetching future date (milliseconds*seconds*minutes*hour*days)
		Date d21 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 4));
		System.out.println("Future date after 4 days is: " + d21);

		// converting d1 to String
		String d2 = d1.toString();

		// fetching month using substring
		String month = d2.substring(4, 7);
		System.out.println(month);

		// fetching day using substring
		String day = d2.substring(0, 3);
		System.out.println(day);

		// fetching current date using substring
		String date = d2.substring(8, 11);
		System.out.println(date);

		// fetching the year using substring
		String year = d2.substring(d2.length() - 4);
		System.out.println(year);
		
		//replace first e with a
		String d3= d2.replaceFirst("e", "a");
		System.out.println(d3);
	}

}
