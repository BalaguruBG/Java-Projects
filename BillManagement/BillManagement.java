package BillManagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BillManagement {
	Dishes d1= new Dishes("Idli",1,8.50);
	Dishes d2= new Dishes("Poori",2,25.0);
	Dishes d3= new Dishes("Dosa",3,50);
	Dishes d4= new Dishes("Pongal",4,40);
	ArrayList<Dishes> dish1 = new ArrayList<>(Arrays.asList(d1,d2,d3,d4));
	static Scanner sc = new Scanner(System.in);
	Hotel h1 = new Hotel("Baagavthi Mess",101,dish1);
	Hotel h2 = new Hotel("Vasan Hotel",102,dish1);
	Hotel h3 = new Hotel("Kumar Mess",103,dish1);
	Hotel h4 = new Hotel("Al reem",104,dish1);
	Hotel h5 = new Hotel("Mubharak",105,dish1);
	ArrayList<Hotel> hotels = new ArrayList<>(Arrays.asList(h1,h2,h3,h4,h5));
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	HashMap<String,HashMap<Double,Integer>> orderedDishes = new HashMap<>();
	
	public static void main(String[] args) throws Exception {

		BillManagement bill = new BillManagement();
		boolean flag = true;
		do {
			System.out.println("\t\t\t===============Swiggy=====================");
			for(int i=0;i<bill.hotels.size();i++) {
				System.out.println(bill.hotels.get(i).hId+"->"+ bill.hotels.get(i).hName);
			}
			System.out.println("Exit->"+"0");
			System.out.print("\t\t\tEnter Hotel Id:");
			int hotel_choice = sc.nextInt();
			for(int i=0;i<bill.hotels.size();i++) {
				if(hotel_choice==0) {
					flag = false;
				}
				if(bill.hotels.get(i).hId==hotel_choice) {
					Hotel selectedHotel = bill.hotels.get(i);
					System.out.println("\n\t\t\tSelected Hotel:"+selectedHotel.hName);
					System.out.println("\n\t\t\tDisplaying Dishes of:"+selectedHotel.hName);
					Thread.sleep(1000);
					boolean dishesFlag = true;
					do {
						Dishes.displayDishes(selectedHotel);
						System.out.println(selectedHotel.dishes.size()+1+"-->"+"Print Bill");
						System.out.println("0--> Back");

						System.out.print("\t\t\tEnter Dish Id To Add:");
						int dishId= sc.nextInt();
						if(Dishes.isDishAvailable(selectedHotel,dishId)) {
							Dishes selectedDish = selectedHotel.dishes.get(dishId-1);
							System.out.print("Enter Quantity Of "+selectedDish.dName+":");
							int qunty = sc.nextInt();
							bill.orderedDishes.put(selectedDish.dName, 
												   new HashMap<>(Map.of(
														   selectedDish.dPrice,
														   bill.orderedDishes.getOrDefault(selectedDish.dName, new HashMap<>())
														   .getOrDefault(selectedDish.dPrice, 0)+qunty))
												   );
							System.out.println("\t\t\t"+selectedDish.dName+" Added...!");
						}
						else if(dishId==selectedHotel.dishes.size()+1) {
							System.out.println("\t\t\tGenerating Bill...");
							Thread.sleep(2000);
							double total =0;
							System.out.println("\n==============BILL==================");
							System.out.println("Dish Name\tQuantity\tPrice");
							for(Map.Entry<String,HashMap<Double,Integer>> entry:bill.orderedDishes.entrySet()) {
								String dishName = entry.getKey();
								for(Map.Entry<Double,Integer> inner: entry.getValue().entrySet()) {
									double price = inner.getKey()
								}
							}
							System.out.println(bill.orderedDishes);
							System.out.println();
							bill.orderedDishes.clear();
						}
						else if(dishId==0) {
							dishesFlag=false;
						}
						
					}while(dishesFlag);{
						System.out.println("\t\t\tRedirecting To Previous Page<---<----");
						Thread.sleep(2000);
					}
				}
			}
		}while(flag);{
			
		}
	}
}
