package structural.design.pattern.facade.pattern;


public class FacadePatternDemo {
	
    public static void main(String[] args) {
    	
        TravelFacade facade = new TravelFacade();
        facade.bookTrip();
    }
}

/*
  🎯 How Is It a Simplified Interface?
	❌ Without the Facade (Client code would look like this):

		FlightBooking flight = new FlightBooking();
		HotelBooking hotel = new HotelBooking();
			flight.bookFlight();
			hotel.bookHotel();

	The client must know:
		How many subsystems exist (FlightBooking, HotelBooking)
		What methods to call, and in what order
*/

