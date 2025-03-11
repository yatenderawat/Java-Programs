package assignments;
/*Assignment 48
WAP to avoid Method Overiding using Final Method*/

class ParentOverride{
	final void add() {
	System.out.println("Parent Add block");	
	}
}
public class MethodOverriding_Assignment48 extends ParentOverride {
	//not able to override as parent class method is final
 void add() {
	System.out.println("Child Add block");
}
public static void main(String[] args) {
	MethodOverriding_Assignment48 m= new MethodOverriding_Assignment48();
	m.add();
}
}
