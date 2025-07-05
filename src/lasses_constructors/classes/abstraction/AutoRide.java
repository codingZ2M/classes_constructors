package lasses_constructors.classes.abstraction;


//Subclass of Ride, implements Payable
//Inherits common ride behavior + adds payment logic
class AutoRide extends Ride {
    private final double ratePerKm = 10;

    public AutoRide() {
        this.baseFare = 30;
    }

    @Override
    public void calculateFare() {
        double totalFare = baseFare + (distanceInKm * ratePerKm);
        System.out.println("🚐 Auto Ride Fare: ₹" + totalFare);
    }
    
    @Override
    public void trackLocation() {
        System.out.println("🚐 Auto is 5 minutes away, live tracking active.");
    }

    @Override
    public void giveRating(int stars) {
        System.out.println("🚐 You rated the auto ride " + stars + " stars. Thanks!");
    }
}