package lasses_constructors.classes.abstraction;

/* Goal: Combine abstract class (is-a) + interface (can-do)
  ✅ "Is-a" Relationship (Abstract Class)
	Used when one class is a type of another.

	Example:
		Car is a Vehicle
		→ Car extends Vehicle

👉 Use abstract class when subclasses share core behavior or identity.
-----------------------------------------------------------------------

✅ "Can-do" Relationship (Interface)
	Used when a class can perform some action or capability.

	Example:
		Car can do Drivable
		→ Car implements Drivable

👉 Use interface to add abilities or roles to unrelated classes.
 */

public class RideBookingApp {
    public static void main(String[] args) {
        Ride ride;

        // Bike ride example
        ride = new BikeRide();
        ride.bookRide("MG Road", "Indiranagar", 5.5);
        ride.calculateFare();  // Output: ₹58.5
        ride.trackLocation();       // from Trackable
        ride.giveRating(5);         // from Rateable

        System.out.println();

        // Car ride example
        ride = new CarRide();
        ride.bookRide("Airport", "City Center", 20);
        ride.calculateFare();  // Output: ₹350
        ride.trackLocation();       // from Trackable
        ride.giveRating(5);         // from Rateable

        System.out.println();

        // Auto ride example
        ride = new AutoRide();
        ride.bookRide("Market", "Railway Station", 8.2);
        ride.calculateFare();  // Output: ₹112
        ride.trackLocation();       // from Trackable
        ride.giveRating(4);         // from Rateable
    }
}


