package assignments;
/*Assignment 60
WAP on SIB and IIB*/

public class Assignment60 {

	// SIB method -> Before main method
	static {
		System.out.println("SIB method");
	}

	// IIB method -> End of main method

	{
		System.out.println("IIB method");
	}

	public static void main(String[] args) {
		System.out.println("SIB, IIB program");
		Assignment60 a = new Assignment60();
		
	}

}
