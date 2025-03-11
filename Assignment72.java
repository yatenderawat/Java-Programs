package assignments;
/*Assignment 72
WAP on basic concepts of Array*/

public class Assignment72 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int a[] = new int[3];
		try {
			a[0] = 25;
			a[1] = 90;
			a[2] = 50;
			a[3] = 40;

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Data provided more than the the index of array");
		}

		System.out.println(a[2]);

	}

}
