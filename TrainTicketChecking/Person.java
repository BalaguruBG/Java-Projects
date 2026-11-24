package trainTicketCheckingOPP;

abstract public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	abstract String displayDetails();
	
}
