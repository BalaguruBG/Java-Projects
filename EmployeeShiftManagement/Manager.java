package Management;

import java.time.LocalDate;

public class Manager {
	String mName;
	int mId;
	
	Manager(String mName,int mId){
		this.mName=mName;
		this.mId=mId;
	}
	public void assignShift(Employee e,int start,int end) {
		LocalDate today = LocalDate.now();
		
		
		if(!today.equals(e.last)) {
			e.totalHour=0;
			e.last=today;
		}
		if(start<0 || start>=24 || end<=0 || end>24 || end<=start) {
			System.out.println("\t\t\tInvalid Shift Timings...!");
			return;
		}
		int shiftduration = end-start;
		int proposedTime = e.totalHour+shiftduration;
		if(proposedTime>8) {
			System.out.println("\t\t\tCannot Assign Shift..!Daily Limit Exceed..!");
			return;
		}
		e.startHour=start;
		e.endHour=end;
		e.totalHour=proposedTime;
		
		System.out.println("\t\t\tShift Assigned SuceesFully...!");
		System.out.println("\t\t\tEmploye Name:"+e.eName);
		System.out.println("\t\t\tShift:" + start+ ":00 - " + end + ":00");
	    System.out.println("\t\t\tShift Duration:" + shiftduration + " hours");
	    System.out.println("\t\t\tShift Date:"+today);
	    System.out.println("\t\t\tTotal Hours Today: " + e.totalHour);
	}
	public void viewAvailableEmployees(Employee[] employees) {
		for(int i=0;i<employees.length;i++) {
			if(employees[i].totalHour>=0 && employees[i].totalHour<8) {
				System.out.println(employees[i].eName+"-"+employees[i].totalHour+"hrs Worked");
			}
		}
	}
	public void employeeWorkingHours(Employee[] employees) {
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i].eName+":"+employees[i].totalHour+"hrs Worked"+":"+(8-employees[i].totalHour)+"hrs can Work for the day");
		}
	}
	public void cancelShift(Employee[] employee,int id) {
		for(int i=0;i<employee.length;i++) {
			if(employee[i].eId==id) {
				if(employee[i].startHour>0) {
					employee[i].startHour=0;
					employee[i].endHour=0;
					System.out.println("\t\t\tShift Cancelled..!");
					System.out.println("\t\t\t"+employee[i].eName+"₹500 Penalty Deduced From Salary..!");
				}
				else {
					System.out.println("\n\t\t\tHey..! Mr "+employee[i].eName+" Shift Itself Not Assigned");
					break;
				}
			}
			else {
				System.out.println("\t\t\tNo Employee Found...!");
				break;
			}
		}
	}
}
