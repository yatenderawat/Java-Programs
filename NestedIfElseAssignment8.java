package assignments;

public class NestedIfElseAssignment8 {

	static void result() {
		int marks = 91;
		if (marks > 33) {

			if (marks > 90) {
				System.out.println("You are brilliant student");
			}

			else if (marks > 75) {
				System.out.println("You are a good student");
			}

			else  {
				System.out.println("You are an average student");
			}

		}

		else
			System.out.println("Sorry! Better luck next year..");

	}

	public static void main(String[] args) {
		result();

	}

}
