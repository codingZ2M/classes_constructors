package structural.design.pattern.facade.pattern;


/*
Facade Pattern
	🔧 Purpose: Provides a simplified, unified interface to a complex subsystem of classes. So instead of dealing 
				with multiple classes directly, the client talks to just one facade class.
					
	✅ Real-World Analogy: A hotel administrator who handles bookings, transport, and restaurant reservations for you.
*/


/*
  Hiding the complexity of two different subsystems:
	FlightBooking
	HotelBooking
 */

class TravelFacade {
	
    private FlightBooking flight = new FlightBooking();
    private HotelBooking hotel = new HotelBooking();

    public void bookTrip() {
        flight.bookFlight();
        hotel.bookHotel();
    }
}


/*
 	✅ With the Facade:
 	TravelFacade travel = new TravelFacade();
		travel.bookTrip();  // 🎉 One call does everything!
	
	Now the client doesn’t need to worry about:
		What objects to create
		What order to call methods in
		How they interact

	The facade class handles all that complexity internally.
 */

