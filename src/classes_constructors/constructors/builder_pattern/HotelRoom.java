package classes_constructors.constructors.builder_pattern;

/*
 Constructor chaining to reduce code duplication — that's great for simpler cases and works fine for a small number of fields.
  But as more features like hasWiFi, roomNumber, isSmokingAllowed, viewType, etc. are added, the constructor becomes hard to read, 
  use, and maintain. 
  And also, adding a new field forces you to change every place that calls this constructor.
  Builder Pattern is designed to solve exactly this — creating scalable, readable object construction.
 */

public class HotelRoom {
	
    private String roomType;
    private double pricePerNight;
    private boolean hasBreakfast;
    private boolean hasWiFi;      // Optional extension
    private int roomNumber;       // Optional extension

    // Private constructor used by Builder
    private HotelRoom(Builder builder) {
        this.roomType = builder.roomType;
        this.pricePerNight = builder.pricePerNight;
        this.hasBreakfast = builder.hasBreakfast;
        this.hasWiFi = builder.hasWiFi;
        this.roomNumber = builder.roomNumber;
    }

    // Static inner Builder class
    public static class Builder {
        // Required fields with defaults matching your no-arg and 2-arg constructors
        private String roomType = "Standard Room";
        private double pricePerNight = 1500.0;
        private boolean hasBreakfast = false;

        // Optional fields
        private boolean hasWiFi;
        private int roomNumber;

        // Builder setters — return Builder for chaining
        public Builder roomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder pricePerNight(double pricePerNight) {
            this.pricePerNight = pricePerNight;
            return this;
        }

        public Builder hasBreakfast(boolean hasBreakfast) {
            this.hasBreakfast = hasBreakfast;
            return this;
        }

        public Builder hasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Builder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        // Final build method
        public HotelRoom build() {
            return new HotelRoom(this);
        }
    }

    // Optional: Getters (if needed)
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
    public boolean hasBreakfast() { return hasBreakfast; }
    public boolean hasWiFi() { return hasWiFi; }
    public int getRoomNumber() { return roomNumber; }
}


/*
 ✅ Why This Is Scalable:
Easy to add new fields:
	Just add a field in Builder, a setter method, and update the build() logic.
	No changes needed in client code if the new field is optional.
No parameter order confusion:
	It's readable: the method names clearly show what each field is.
Optional fields are truly optional:
	You only set what you need, and defaults can be handled internally.


🔁 Alternative: Use Multiple Constructors or Setters (Less Ideal)
You could use constructor overloading or setters, but:
	Overloading leads to explosion of constructor variants.
	Setters make objects mutable — which may be unsafe if the object should be immutable.
	
🔚 Summary
To make constructors scalable for future features like hasWiFi, roomNumber, etc.:
	Use the Builder pattern: flexible, readable, and clean.
	Avoid long parameter lists and constructor overloading as your object grows.
	Builders are the standard, scalable approach in Java for complex object creation.
*/
