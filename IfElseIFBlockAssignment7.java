package assignments;

public class IfElseIFBlockAssignment7 {
	
	static void result() {
        int marks = 75;
        
        // Check for marks > 90 first
        if (marks > 90) {
            System.out.println("You are a brilliant student");
        }
        // Check for marks > 75 but <= 90
        else if (marks > 75) {
            System.out.println("You are a good student");
        }
        // Check for marks > 50 but <= 75
        else if (marks > 50) {
            System.out.println("You are an average student");
        }
        // Check for marks > 33 but <= 50
        else if (marks > 33) {
            System.out.println("Passed! But not enough...");
        }
        // If none of the above, it means marks <= 33
        else {
            System.out.println("Sorry! Better luck next year...");
        }
    }
	public static void main(String[] args) {
		result();
	}

}
