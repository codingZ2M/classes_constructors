package lasses_constructors.classes.abstraction;


//Subclass of Ride, implements Payable
//Inherits common ride behavior + adds payment logic
class BikeRide extends Ride {
    private final double ratePerKm = 7;

    public BikeRide() {
        this.baseFare = 20;
    }

    @Override
    public void calculateFare() {
        double totalFare = baseFare + (distanceInKm * ratePerKm);
        System.out.println("🛵 Bike Ride Fare: ₹" + totalFare);
    }
    
    @Override
    public void trackLocation() {
        System.out.println("🛵 Bike is 15 minutes away, live tracking active.");
    }

    @Override
    public void giveRating(int stars) {
        System.out.println("🛵 You rated the bike ride " + stars + " stars. Thanks!");
    }
}