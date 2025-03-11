package assignments;
/*Assignment 74
WAP to pass anything at Runtime using args variable in the main method*/


public class Assignment74 {
	public static void main(String[] args) {
		if(args.length>2) {
			System.out.println("Strong input");
			
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
		else
		{
			System.out.println("Weaker Input");
		}
		
		
	}

}
