package assignments;
/*Assignment 68
Wap on String Function using concat and contains concept*/

public class Assignment68 {
	public static void main(String[] args) {
		String name1= "Yatendra";
		String middleName= " Singh";
		String name2= name1.concat(middleName);
		String name3= name2.concat(" Rawat").concat(": good boy");
		System.out.println(name3);
		boolean result= name3.contains(name1);
		System.out.println(result);
		
		boolean result2=name3.contains("college");
		System.out.println(result2);
	}

}
