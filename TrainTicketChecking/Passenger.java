package trainTicketCheckingOPP;

public class Passengers extends Person{
	double price;
	String src;
	String des;
	boolean ticketStatus;
	
	Passengers(String name,int age,double price,String src,String des,boolean ticketStatus){
		super(name,age);
		this.price=price;
		this.src=src;
		this.des=des;
		this.ticketStatus=ticketStatus;
	}
	public boolean hasValidTicket() {
		return ticketStatus;
	}
	@Override
	String displayDetails() {
		return "Pass Name:"+name+"\n"+"Pass Age:"+age+"\n"+"Ticket Price:"+price+"\n"+"Source:"+src+"\n"+"Desination:"+des+"\n"+"Ticket status:"+ticketStatus;
	}
	@Override
	public String toString() {
		return displayDetails();
	}
	
	
}
