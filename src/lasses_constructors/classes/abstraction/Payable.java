package lasses_constructors.classes.abstraction;

// Any class that can calculate a fare must implement this method
// Represents ability to calculate fare (can-do)
// Can-do: CarRide can be Payable
public interface Payable {
    void calculateFare();
}