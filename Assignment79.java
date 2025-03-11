package assignments;

import java.util.Arrays;
import java.util.Scanner;

/*Assignment 79
WAP to copy one array into another array in reverse order*/
public class Assignment79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking size of array at run time
		System.out.println("Enter the size of Array 1:");
		int[] arr1 = new int[sc.nextInt()];
		int[] reverse = new int[arr1.length];
		System.out.println("Enter the elements in Array 1:");
		for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
			arr1[i] = sc.nextInt();
			reverse[j] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("Copied the Array in another with reverse order: " + Arrays.toString(reverse));
		sc.close();
	}
}
