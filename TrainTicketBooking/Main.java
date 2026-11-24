package trainTicketBooking;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		Train t1 = new Train("TVR-CHENNAI EXP",101,"Thiruvarur","Chennai",120,new int[3][5]);
		Train t2 = new Train("CHEENAI-TVR EXP",102,"Chennai","Thiruvarur",120,new int[5][5]);
		Train[] trains= {t1,t2};
		Train train = new Train();
		boolean flag = true;
		do {
			System.out.println("\t\t\t========== TRAIN TICKET BOOKING===========");
			System.out.println("1,View Available Trains\n2,Book Ticket\n3,Exit");
			System.out.print("\t\tEnter Your Choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.print("\t\tEnter Your Train No ");
				int train_no=sc.nextInt();
				boolean found=false;
				System.out.println("\t\tPlease Wait....!");
				Thread.sleep(2000);
				for(int i=0;i<trains.length;i++) {
					if(train_no==trains[i].getTrainNo()) {
						found=true;
						trains[i].display();
						break;
					}
					if(!found){
						System.out.println("\t\tNo Such Train Is Available..!");
					}
				}				
			}
			case 2->{
				System.out.print("Enter Passenger's Name:");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter Passenger's Age:");
				int age = sc.nextInt();
				System.out.print("Enter Passenger's Contact:");
				long contact = sc.nextLong();
				System.out.println("\t\t\tPlease Wait....!");
				Thread.sleep(2000);
				Passenger p1 = new Passenger(name,age,contact);
				System.out.print("Enter Train No ");
				int train_no=sc.nextInt();
				System.out.println("\t\tPlease Wait....!");
				Thread.sleep(2000);
				for(int i=0;i<trains.length;i++) {
					if(train_no==trains[i].getTrainNo()) {
						System.out.println("\t\tSelected Train Number:"+train_no);
						trains[i].display();
						System.out.print("(0->Availabe)\n(1->Filled)\n\t\tSelect Your Seat\n");
						System.out.print("Enter Your Coach no:");
						int coach = sc.nextInt();
						System.out.print("Enter Your Seat no:");
						int seatno=sc.nextInt();
						if(trains[i].is_valid(seatno, coach)) {
							File ticket = new File("E:\\JavaCourse\\FileHandling\\TicketBooking\\Ticket.txt");
							ticket.createNewFile();
							FileWriter fw = new FileWriter(ticket,true);
							BufferedWriter bw = new BufferedWriter(fw);
							bw.write("\t\t\t====Ticket Deails====\n");
							bw.write("Train No:"+trains[i].getTrainNo()+"\n");
							bw.write("Train Name:"+trains[i].getTrainName()+"\n");
							bw.write("Train Sorce Station:"+trains[i].getSrc()+"\n");
							bw.write("Train Destination Station:"+trains[i].getDes()+"\n");
							bw.write("Passenger Name:"+p1.getName()+"\n");
							bw.write("Passenger Age:"+p1.getAge()+"\n");
							bw.write("Passenger Contact:"+p1.getContact()+"\n");
							bw.write("----------------------------------------------");
							bw.flush();
							bw.close();
							System.out.println("\t\t\tPlease Wait.....!");
							Thread.sleep(2000);
							System.out.println("\t\t\tTicket booked SuccessFully.....!");
							Thread.sleep(2000);
							System.out.println("View Your Ticket Here\nE:\\\\JavaCourse\\\\FileHandling\\\\TicketBooking\\\\Ticket.txt");
							Thread.sleep(2000);
							break;
						}
						
					}
				}
				
			}
			case 3->{
				flag = false;
			}
			}
		}while(flag); {
			System.out.println("\t\t\tThank You For Using it....!");
		}
	}
}
