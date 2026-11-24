package trainTicketCheckingOPP;

public class Station {
	String stationName;
	String loc;
	Trains[] trains;
	
	Station(String stationName,String loc,Trains[] trains){
		this.stationName=stationName;
		this.loc=loc;
		this.trains=trains;
	}
    public String stationDetails() {
        return "Station Name: " + stationName +"\nLocation: " + loc;
    }
}
