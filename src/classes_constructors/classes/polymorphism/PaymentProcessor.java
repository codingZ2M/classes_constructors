package classes_constructors.classes.polymorphism;


// A component that process payments
public class PaymentProcessor {

    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);  // Polymorphic call
    }

    public static void main(String[] args) {
    	
    	//  Using Polymorphism in Business Logic
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCardPayment(), 1500.0);
        processor.processPayment(new PayPalPayment(), 900.0);
        processor.processPayment(new UpiPayment(), 400.0);
    }
}



/*
  What's Happening Behind the Scenes?
  PaymentMethod method = new PayPalPayment();  // Base type reference
  method.pay(500);  // Calls PayPalPayment's pay() method

The JVM uses dynamic dispatch to call the correct pay() method based on the actual object, not the reference type.
This is runtime polymorphism.
*/