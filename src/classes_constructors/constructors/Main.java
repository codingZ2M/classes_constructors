package classes_constructors.constructors;

public class Main {

	public static void main(String[] args) {
		
		  HotelRoom room1 = new HotelRoom();  // Default
	        HotelRoom room2 = new HotelRoom("Suite", 3500.0);  // Name + price
	        HotelRoom room3 = new HotelRoom("Presidential Suite", 9000.0, true);  // Full

	        room1.displayDetails();
	        room2.displayDetails();
	        room3.displayDetails();

	}

}
