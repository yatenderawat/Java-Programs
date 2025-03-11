package assignments;

import java.util.Arrays;

/*Assignment 78
WAP to copy one array into another array*/

public class Assignment78 {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 5;
		a[1] = 15;
		a[2] = 6;
		a[3] = 13;

		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			// coping array1 elements to array2
			b[i] = a[i];
		}

		System.out.println("Arrays1 elements are: " + Arrays.toString(a));
		System.out.println("Arrays2 elements are: " + Arrays.toString(b));
	}

}
