package trainTicketCheckingOPP;

public class Trains {
	String trainName;
	int trainNo;
	String src;
	String des;
	Passengers[] passengers;
	
	Trains(	String trainName,int trainNo,String src,String des,Passengers[] passengers){
		this.trainName=trainName;
		this.trainNo=trainNo;
		this.src=src;
		this.des=des;
		this.passengers=passengers;
	}
	
	public String trainDetails() {
        return "Train Name: " + trainName +"\nTrain Number: " + trainNo +"\nSource: " + src +"\nDestination: " + des;	}	
	
}
