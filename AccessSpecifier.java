package package1;

public class AccessSpecifier {
	//calling with different Access specifier

	public static void add() {
		System.out.println("Add");

	}

	protected static void mul() {
		System.out.println("mul");
	}

	private static void div() {
		System.out.println("div");
	}

	 static void mod() {
		 System.out.println("mod");
	}

	public static void main(String[] args) {
		add();
		mul();
		div();
		mod();

	}

}
