package trainTicketCheckingOPP;

public class TicketChecker extends Person{
	int empid;
	static final double FINE_AMOUNT=500;
	TicketChecker(String name,int age,int empid){
		super(name,age);
		this.empid=empid;
	}
	
	public boolean checkTicket(Passengers passenger) {
		return passenger.hasValidTicket();
	}
	
	public double calculateFine(Passengers passenger) {
		if(!checkTicket(passenger)) {
			return passenger.price+FINE_AMOUNT;
		}
		return 0;
	}
	@Override
	String displayDetails() {
		return "Employee Name:"+name+"\nAge:"+age+"\nEmployee_id:"+empid;
	}
}
