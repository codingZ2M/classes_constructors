package behavioral.design.patterns.strategy.pattern;

// Business Logic Layer
/*
  🔧 Purpose:
		Acts as the main component representing the user's checkout flow
		Delegates payment behavior to PaymentContext
		Let users choose their preferred payment method (setPaymentStrategy(...))
		Initiate checkout and trigger the payment (checkout(...))
		ShoppingCart doesn't care how payment works — only that it works.
 */
public class ShoppingCart {
	
	 private final PaymentContext paymentContext = new PaymentContext();

	   public void setPaymentStrategy(PaymentStrategy strategy) {
	        paymentContext.setStrategy(strategy);
	    }

	    public void checkout(int amount) {
	        paymentContext.executePayment(amount);
	    }
	    
}

