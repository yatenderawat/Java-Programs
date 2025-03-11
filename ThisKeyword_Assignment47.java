package assignments;

public class ThisKeyword_Assignment47{
	int age;
	char gender;
	String state;
	
	void details(int age, char gender) {
		this.age=age;
		this.gender=gender;
		//this.state=state;
		System.out.println(gender);
		System.out.println(age);
		
	}
	
public static void main(String[] args) {
	ThisKeyword_Assignment47 a= new ThisKeyword_Assignment47();
	a.details(28, 'M');
	/*
	 * System.out.println(a.age); System.out.println(a.gender);
	 * System.out.println(a.state);
	 */
}
}

