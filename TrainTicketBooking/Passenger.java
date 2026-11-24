package trainTicketBooking;

public class Passenger {
	private String name;
	private int age;
	private long contact;
	
	Passenger(String name,int age,long contact){
		this.name=name;
		this.age=age;
		this.contact=contact;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public long getContact() {
		return contact;
	}
}
