package classes_constructors.constructors;


// Flexible room creation with overloaded constructors: from a fully default room to a highly customized one.
public class HotelRoom {
    private String roomType;
    private double pricePerNight;
    private boolean hasBreakfast;

    // ✅ Default constructor:  Provides default initialization
    // A booking comes with default details...(no customization is needed)
    // Ensures all paths eventually route to the main constructor, centralizing initialization logic.
    public HotelRoom() {
        this("Standard Room", 1500.0, false); // Constructor chaining to reduce code repetition (To route to the master constructor)
    }

    
    // Multiple constructors with different parameters for flexible object creation
    // A partially customized booking...
    // ✅ Constructor with two parameters
    // Ensures all paths eventually route to the main constructor, centralizing initialization logic.
    public HotelRoom(String roomType, double pricePerNight) {
        this(roomType, pricePerNight, false);   // (To route to the master constructor)
    }

    // ✅ Full constructor (master constructor)
    // A fully customized booking...
    public HotelRoom(String roomType, double pricePerNight, boolean hasBreakfast) {
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.hasBreakfast = hasBreakfast;
    }

    // ✅ Method to display details
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price/Night: ₹" + pricePerNight);
        System.out.println("Breakfast Included: " + (hasBreakfast ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}

/*
💡  Design Insights:
🔁 Avoids duplication – central logic lives in one constructor
🧱 Scalable – easy to add new features like hasWiFi, roomNumber
✅ Clean code – chaining enhances readability and maintenance
*/