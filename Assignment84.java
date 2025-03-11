package assignments;

/*Assignment 84
"WAP on string functions
using replace, replaceAll, substring, matches, repeat"
*/
public class Assignment84 {
	public static void main(String[] args) {
		String str = "Mahendra Singh Dhoni"+"hui";
		str= str+"def";
		System.out.println(str);
		
		String e= new String("jk");
		System.out.println("Original string is: " + str);
		// replace() str.toLowerCase();
		String replace1 = str.toLowerCase().replace('m', 'd');
		System.out.println(replace1);

		// replaceAll
		String replace2 = str.replaceAll("[d-l]", "y");
		System.out.println(replace2);

		/*
		 * replaceAll it only replace the char between D-L or d-l it does not replace
		 * A,B,C,M,N,O...a,b,c,m,n,o..args.
		 */

		String replace3 = str.replaceAll("[D-l]", "y");
		System.out.println(replace3);

		// substring with single parameter
		String str1 = str.substring(5);
		System.out.println(str1);

		// substring with double parameter
		String str2 = str.substring(4, 19);
		System.out.println(str2);
		
		//repeat
		String repeat= (str.concat(" ")).repeat(2);
		System.out.println(repeat);
	}
}