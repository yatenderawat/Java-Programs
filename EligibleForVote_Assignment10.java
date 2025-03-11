package assignments;

public class EligibleForVote_Assignment10 {

	/*
	 * WAP to check person can vote only if he/she is 18 or above and should not
	 * vote if age is less.
	 */

	static void voteEligibility() {
		int age = 10;
		char female = 'F';
		char male = 'M';

		if (age >= 18) {
			if (female == 'F' || male == 'M') {

				System.out.println("You are eligible to vote..");
			} else {
				System.out.println("Invalid gender");
			}
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

	public static void main(String[] args) {
		voteEligibility();

	}

}
