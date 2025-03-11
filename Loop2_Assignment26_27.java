package assignments;

/*Assignment 26
"WAP for infinite loop"

Assignment 27
"WAP to run a for loop that does not start."
*/

public class Loop2_Assignment26_27 {
	static int i = 1;
	
	static void loopNotStart() {
		for (i = 1; i > 5; i--) {
			System.out.println(i);
		}
	}
	static void infiniteLoop() {
		for (i = 1; i < 5; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		loopNotStart();
		infiniteLoop();

	}

}
