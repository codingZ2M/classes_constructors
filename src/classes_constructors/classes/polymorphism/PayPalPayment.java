package classes_constructors.classes.polymorphism;


// A concrete implementation of the abstraction
public class PayPalPayment implements PaymentMethod {
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
    
}