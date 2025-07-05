package lasses_constructors.classes.abstraction;

/*
 Abstraction: Abstraction in Java is a concept of hiding the complex implementation details and showing only the 
 essential features of an object or a system.
 
Abstraction in Java simplifies system design by focusing on what an object does rather than how it does it.
By using abstract classes or interfaces, you can design flexible, maintainable, and secure systems.
Abstraction shields users from complexity and enforces a clean, intuitive interface.

Java provides abstraction using:
	Abstract classes
	Interfaces
 */


/*
   🔹 Problem: In a ride-hailing app, users can book different types of rides:
				🚗 Car Ride
				🛵 Bike Ride
				🚐 Auto Rickshaw Ride
				Hides Complexity: Distance calculation, pricing models, surge pricing logic hidden from the user
				— it just lets you book the ride. That’s abstraction.
				User sees only high-level operations(bookRide(), calculateFare())  &  interacts with the interface (booking, paying): Doesn't need to know the math behind the fare or the mapping algorithm.
				
 */

//  Ride: Defines shared properties (is-a relationship)
//  Implements Payable, so it promises that all subclasses must provide calculateFare()
abstract class Ride implements Payable, Trackable, Rateable {
    protected double baseFare;
    protected double distanceInKm;

    // Common logic across all ride types (shared in base class)
    public void bookRide(String pickup, String destination, double distanceInKm) {
        this.distanceInKm = distanceInKm;
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distanceInKm + " km");
    }
}


/*
  🔹 Why Use Abstraction?
Reduce Complexity: Hide unnecessary internal workings.

Increase Reusability: Code can be reused via interfaces or base classes.

Improve Maintainability: Changes in implementation don’t affect users of the abstraction.
						 Now, inside CarRide.calculateFare(), you can:
							Change the rate per km,
							Add surge pricing,
							Modify how fare is calculated,
						 BUT the code that uses it (ride.calculateFare()) stays the same. No changes are needed in the calling code.
						
Enforce Standards: Interfaces or abstract classes can define contracts.
Adding new types: 	You can create a new class (e.g., LuxuryCarRide) without touching existing logic
*/



/*
  🔹 How Java Provides Abstraction:
  | Mechanism        | Description                                                                |
| ---------------- | -------------------------------------------------------------------------- |
| `abstract class` | Can have abstract (unimplemented) and concrete methods.                    |
| `interface`      | Fully abstract (before Java 8), but can have default/static methods after. |
 */



/*
  🔹 Real-World Benefits:
  	| Benefit             | Explanation                                                             |
| ------------------- | ----------------------------------------------------------------------- |
| **Flexibility**     | You can add new types of "Rides" without changing user-facing code |
| **Security**        | Hide sensitive logic (e.g., authentication, server communication)       |
| **Maintainability** | You can update internal logic without affecting users                   |
 */


/*
  🔸 Summary Table:
  | Feature          | Abstract Class                 | Interface                      |
| ---------------- | ------------------------------ | ------------------------------ |
| Inheritance type | Single                         | Multiple                       |
| Contains fields  | Yes (both static and instance) | Only static final constants    |
| Method types     | Abstract and concrete          | Abstract (plus static/default) |
| Use case         | "Is-a" relationship            | "Can-do" relationship          |

 */
