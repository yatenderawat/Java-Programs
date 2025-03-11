package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment62 {
	
	static void login() {
		Scanner s1= new Scanner(System.in);
		try {
		
		System.out.println("Enter the Aadhar number");
		int aadhar= s1.nextInt();
		}
		
		catch(InputMismatchException e) {
			System.out.println("Enter the Aadhar number, only digit 2 Attempt left");
		}
		System.out.println("Enter the Password");
		String password=s1.next();
		
		System.out.println("Use user name is "+aadhar);
		System.out.println("Use user password is "+password);
		
		
	}
	
	public static void main(String[] args) {
		login();
	}

}
