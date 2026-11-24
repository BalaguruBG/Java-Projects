package BillManagement;

public class Dishes {
	String dName;
	int dId;
	double dPrice;
	
	Dishes(String dName,int dId,double dPrice){
		this.dName=dName;
		this.dId=dId;
		this.dPrice=dPrice;
	}
	
	@Override
	public String toString() {
		return dId+"-->"+dName+"-->"+dPrice+"\n";
	}
	public static void displayDishes(Hotel hotel) {
		System.out.println(hotel.dishes);
	}
	public static boolean isDishAvailable(Hotel hotel,int choice) {
		for(int i=0;i<hotel.dishes.size();i++) {
			if(hotel.dishes.get(i).dId==choice) {
				return true;
			}
		}
		return false;
	}
}
