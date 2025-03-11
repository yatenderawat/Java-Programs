package assignments;

public class GlobalVariable_Assignment18 {
	//Global variable
	int a = 100; 
	int b = 200;
	static int c= 300;

	void mul() {
		System.out.println("non static");
	}
	
	static void add() {
		
		GlobalVariable_Assignment18 b= new GlobalVariable_Assignment18();
		int sum = c + b.b;
		System.out.println(sum);
		//mul(); we cannot call non-static method under static method without creating an object.
	}

	void sub() {
		
		int subt = a - b;
		System.out.println(subt);
		mul(); // we can call non-static method under non-static method
	}

	public static void main(String[] args) {
		/*
		 * non-static method calling non-static variable by creating the object
		 */
		GlobalVariable_Assignment18 a = new GlobalVariable_Assignment18();
		a.sub();
		add();
	}
}
