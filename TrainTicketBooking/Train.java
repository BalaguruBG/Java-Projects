package trainTicketBooking;

public class Train {
	private String trainName;
	private int trainNo;
	private String src;
	private String des;
	private double price;
	private int[][] seats;
	
	Train(){
		
	}
	Train(String trainName,int trainNo,String src,String des,int price,int[][] seats){
		this.trainName=trainName;
		this.trainNo=trainNo;
		this.src=src;
		this.des=des;
		this.price=price;
		this.seats=seats;
	}
	public String getTrainName() {
		return trainName;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public String getSrc() {
		return src;
	}
	public String getDes() {
		return des;
	}
	public double getPrice() {
		return price;
	}
	public int[][] getSeats() {
		return seats;
	}
	public void display() {
		System.out.println("----------");
		for(int i=0;i<seats.length;i++) {
			for(int j=0;j<seats[i].length;j++) {
				System.out.print(seats[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------");
	}
	public boolean is_valid(int row,int col) {
		if(seats[row][col]==0) {
			seats[row][col]=1;
			return true;
		}
		System.out.println("\t\t\tSeat Already Occupied...!");
		return false;
	}
	
}
