package classes_constructors.constructors.builder_pattern;

public class Main {
    public static void main(String[] args) {
    	
    	// Matches: HotelRoom()
    	HotelRoom room1 = new HotelRoom.Builder().build();
    	
    	 System.out.println("Room Type: " + room1.getRoomType());
         System.out.println("Price per night: " + room1.getPricePerNight());
         System.out.println("Breakfast included: " + room1.hasBreakfast());
         System.out.println("WiFi available: " + room1.hasWiFi());
         System.out.println("Room Number: " + room1.getRoomNumber());
         System.out.println("********************************************************");
         
      // Matches: HotelRoom("Deluxe", 2000.0)
         HotelRoom room2 = new HotelRoom.Builder()
             .roomType("Deluxe")
             .pricePerNight(2000.0)
             .build();
         
         System.out.println("Room Type: " + room2.getRoomType());
         System.out.println("Price per night: " + room2.getPricePerNight());
         System.out.println("Breakfast included: " + room2.hasBreakfast());
         System.out.println("WiFi available: " + room2.hasWiFi());
         System.out.println("Room Number: " + room2.getRoomNumber());
         System.out.println("********************************************************");
         
         
      // Matches: HotelRoom("Suite", 2500.0, true)
         HotelRoom room3 = new HotelRoom.Builder()
             .roomType("Suite")
             .pricePerNight(2500.0)
             .hasBreakfast(true)
             .build();
         
         System.out.println("Room Type: " + room3.getRoomType());
         System.out.println("Price per night: " + room3.getPricePerNight());
         System.out.println("Breakfast included: " + room3.hasBreakfast());
         System.out.println("WiFi available: " + room3.hasWiFi());
         System.out.println("Room Number: " + room3.getRoomNumber());
         System.out.println("********************************************************");
         
         

      // With extensions
      HotelRoom room4 = new HotelRoom.Builder()
          .roomType("Executive Suite")
          .pricePerNight(3500.0)
          .hasBreakfast(true)
          .hasWiFi(true)
          .roomNumber(505)
          .build();
      
      System.out.println("Room Type: " + room4.getRoomType());
      System.out.println("Price per night: " + room4.getPricePerNight());
      System.out.println("Breakfast included: " + room4.hasBreakfast());
      System.out.println("WiFi available: " + room4.hasWiFi());
      System.out.println("Room Number: " + room4.getRoomNumber());
    }
}

/*
 🧠 Step-by-Step Breakdown:
 
 ✅ new HotelRoom.Builder()
➜ This creates a new object of the static Builder class.
➜ This is where the object is made.

✅ .roomType("Suite")
➜ This sets the roomType field in the Builder object just created.

✅ .build()
➜ Calls the build() method on that Builder object.

✅ return new HotelRoom(this);
➜ this refers to the Builder object — which holds all the field values you just set.
➜ The HotelRoom constructor uses that data to construct the final object.
 
*/
