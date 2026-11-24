		package trainTicketCheckingOPP;
		
		import java.io.File;
		import java.io.FileWriter;
		
		public class Main {
			Passengers p1= new Passengers("Bala",22,120,"Chennai","Thiruvarur",false);
			Passengers p2= new Passengers("Harish",18,160,"Chennai","Coimbatore",true);
			Passengers p3= new Passengers("Jayan",24,40,"Chennai","Arani",false);
			Passengers p4= new Passengers("Akash",27,170,"Chennai","Madurai",false);
			Passengers p5= new Passengers("Shelton",23,180,"Chennai","Valparai",true);
			Passengers p6= new Passengers("Prashanth",22,150,"Chennai","Kayalpattinam",false);
			Passengers p7= new Passengers("Arivu",20,140,"Chennai","Theni",false);
			Passengers p8= new Passengers("Roshan",22,180,"Chennai","Thoothukudi",true);
			Passengers p9= new Passengers("Aravinth",21,70,"Chennai","Vilupuram",true);
			Passengers p10= new Passengers("Dhinesh",21,90,"Chennai","Karur",true);
			
			Passengers[] passengers = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
			Passengers[] southpassengers = {p4,p6,p7,p8};
			Passengers[] eastpassengers= {p1,p9,p10};
			Passengers[] westpassengers= {p2,p3,p5};;
			
			
			Trains t1= new Trains("South",101,"Chennai","Coimbatore",westpassengers);
			Trains t2= new Trains("East",102,"Chennai","Thiruvarur",southpassengers);
			Trains t3= new Trains("West",103,"Chennai","Madurai",westpassengers);
			
			Trains[] trains = {t1,t2,t3};
			
			Station s1 = new Station("MGR","Chennai",new Trains[] {t1});
			Station s2 = new Station("Egmore","Chennai",new Trains[] {t2});
			Station s3 = new Station("Tambaram","Chennai",new Trains[] {t3});
			
			Station[] stations = {s1,s2,s3};
			
			public static void main(String[] args)throws Exception{
				Main obj = new Main();
				TicketChecker check = new TicketChecker("Dhoni",41,007);
				File report = new File("E:\\JavaCourse\\FileHandling//FinedPassengerOPP.txt");
				report.createNewFile();
				FileWriter fw= new FileWriter(report,true);
				fw.write("\t\t\t********************Fined Passengers**************************\n");
				fw.write(check.displayDetails()+"\n\n");
				int finedCount=0;
				for(int i=0;i<obj.stations.length;i++) {
					Station s=obj.stations[i];
					for(int j=0;j<s.trains.length;j++) {
						Trains t = s.trains[j];
						for(int k=0;k<t.passengers.length;k++) {
							Passengers p = t.passengers[k];
							
							if(!check.checkTicket(p)) {
								double fine = check.calculateFine(p);
								fw.write("--------------------------------------------------------------\n");
								fw.write(s.stationDetails()+"\n");
								fw.write(t.trainDetails()+"\n");
								fw.write(p.displayDetails()+"\n");
								fw.write("Fine Amount ₹500:"+fine+"\n");
								fw.write("--------------------------------------------------------------\n");
								finedCount++;
							}
						}
					}
				}
			    fw.write("Total fined passengers: " + finedCount + "\n");
			    fw.flush();
			    fw.close();
			    System.out.println("Report generated successfully.");
			    System.out.println("Total fined passengers: " + finedCount);
			}
		}
