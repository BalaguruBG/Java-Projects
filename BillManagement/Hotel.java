package BillManagement;

import java.util.ArrayList;

public class Hotel{
	String hName;
	int hId;
	ArrayList<Dishes> dishes;
	
	Hotel(String hName,int hId,ArrayList<Dishes> dishes){
		this.hName=hName;
		this.hId=hId;
		this.dishes=dishes;
	}
}
