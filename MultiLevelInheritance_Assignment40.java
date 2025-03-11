package assignments;

class Parent1 extends Parent2{
	 void add() {
		System.out.println("Parent1 calling");
	}
}

class Parent2 {
	 void sub() {
		System.out.println("GrandParent calling");
	}
}

public class MultiLevelInheritance_Assignment40 extends Parent1{
	 void mul() {
		System.out.println("Child Class calling...");
	}
public static void main(String[] args) {
	/*
	 * If method were static then an no need to create
	 * an object
	 */
	MultiLevelInheritance_Assignment40 ch= new MultiLevelInheritance_Assignment40();
	ch.add();
	ch.sub();
	ch.mul();
	/*
	 * mul(); add(); sub();
	 */
}
}
