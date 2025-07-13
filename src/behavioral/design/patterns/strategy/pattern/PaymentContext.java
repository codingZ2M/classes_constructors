package behavioral.design.patterns.strategy.pattern;

//  Strategy Handler
/* 🔧 Purpose:
	Encapsulates the interchangeable payment behavior
	Responsible for holding and executing the strategy
	Delegate the actual payment to the selected strategy (executePayment(...))
	Cleanly separates strategy management logic from the rest of the app
*/
public class PaymentContext {
	
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set.");
        }
        strategy.pay(amount);
    }
}
