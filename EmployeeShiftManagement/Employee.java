package Management;

import java.time.LocalDate;

public class Employee {
	String eName;
	int eId;
	int startHour;
	int endHour;
	int totalHour=0;
	LocalDate last = LocalDate.now();	

	
	Employee(String eName,int eId){
		this.eName=eName;
		this.eId=eId;
	}
	@Override
	public String toString() {
		return eName+":"+eId;
	}
	public boolean isWorkAssignable() {
		return totalHour<8;
	}
}



