package Management;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("Bala",101);
		Employee e2 = new Employee("Jayan",102);
		Employee e3 = new Employee("Arivu",103);
		Employee e4 = new Employee("Dhinesh",104);
		
		LocalDate today = LocalDate.now();
		Employee[] employee = {e1,e2,e3,e4};
		Manager m1 = new Manager("Akash",201);
		
		boolean flag = true;
		do {
			System.out.println("=====================================================================");
			System.out.println("\t\t\tEmployee Shift Management");
			System.out.println("=====================================================================");
			System.out.println("Manager:"+m1.mName+"\t Todays Date:"+today+"\n");
			System.out.println("1.View All Employees\n2.Assign Shift\n3.View Available Employees\n4.View Employee Working Hours\n5.Cancel Shift\n6.Exit");
			System.out.print("\nEnter Your Choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1->{
				for(int i=0;i<employee.length;i++) {
					System.out.println("\t"+employee[i]);
				}
			}
			case 2->{
				System.out.print("Enter Employee Id:");
				int e_id = sc.nextInt();
				for(int i=0;i<employee.length;i++) {
					if(employee[i].eId==e_id) {
						System.out.print("Enter StartHour(0-23):");
						int start=sc.nextInt();
						System.out.print("Enter EndHour(1-24):");
						int end = sc.nextInt();
						m1.assignShift(employee[i], start, end);
						break;
					}
					else {
						System.out.println("\t\t\tEmployee Id Not Found..!");
						break;
					}
				}
			}
			case 3->{
				System.out.println("\t\t\t Available Employees");
				m1.viewAvailableEmployees(employee);
			}
			case 4->{
				System.out.println("\t\t\tEmployee Working Hours");
				m1.employeeWorkingHours(employee);
			}
			case 5->{
				System.out.println("\t\t\tCancel Shift");
				System.out.print("Enter Employee Id:");
				int id = sc.nextInt();
				m1.cancelShift(employee,id);
			}
			case 6->{
				flag = false;
			}
			
		}
			
		}while(flag);{
			System.out.println("\t\t\tThank You For Using it...!");
		}
	}
}
