package assignments;
/*Assignment 69
WAP on String Function using equals and equalsIgnoreCase concept*/

public class Assignment69 {

	public static void main(String[] args) {

		String name = "Yatender";
		// checking equal case
		boolean result = name.equals("YaTender");
		System.out.println(result);

		// checking equal Ignore case
		boolean result2 = name.equalsIgnoreCase("YATenDeR");
		System.out.println(result2);

	}

}
