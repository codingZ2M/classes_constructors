package classes_constructors.classes.polymorphism;


// A concrete implementation of the abstraction
public class CreditCardPayment implements PaymentMethod {
	
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}





