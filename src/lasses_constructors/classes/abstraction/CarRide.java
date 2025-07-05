package lasses_constructors.classes.abstraction;


// Subclass of Ride, implements Payable
// Inherits common ride behavior + adds payment logic
class CarRide extends Ride {
    private final double ratePerKm = 15;

    public CarRide() {
        this.baseFare = 50;
    }

    @Override
    public void calculateFare() {
        double totalFare = baseFare + (distanceInKm * ratePerKm);
        System.out.println("🚗 Car Ride Fare: ₹" + totalFare);
    }
    
    @Override
    public void trackLocation() {
        System.out.println("🚗 Car is 5 minutes away, live tracking active.");
    }

    @Override
    public void giveRating(int stars) {
        System.out.println("🚗 You rated the car ride " + stars + " stars. Thanks!");
    }
}