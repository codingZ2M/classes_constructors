package behavioral.design.patterns.strategy.pattern;

// Implement PayPalPayment Strategy
public class PayPalPayment implements PaymentStrategy {
	
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
