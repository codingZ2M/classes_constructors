package behavioral.design.patterns.strategy.pattern;

// Implement CreditCardPayment Strategy
public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}