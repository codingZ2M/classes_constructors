package behavioral.design.patterns.strategy.pattern;


/*
   ➤ Behavioral Design Patterns
	  These are all about how classes and objects interact, communicate, and share responsibilities.
 */

/*
   ➤ Strategy Pattern Purpose: Define a family of algorithms (strategies), put each one in its own class, and make them interchangeable
     — so you can change the algorithm at runtime without modifying the client.
     
   🎯 Real-World Analogy:
	 You use different payment methods (credit card, PayPal, UPI), but the checkout system just calls pay() — it doesn't care which method you use.
 */

/*
   🧠 When to Use:
		You want to swap out different algorithms (e.g., sorting, payment, compression).
		You want to avoid long if-else or switch statements based on behavior.
		You want to encapsulate behavior separately from the main class.
 */

public class Main {
	
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(1000);
    }
}


/*
   🔄 Benefits of Strategy Pattern:
   | Benefit                 | Explanation                                      |
| ----------------------- | ------------------------------------------------ |
| ✅ Open/Closed Principle | Easily add new strategies without changing code. |
| ✅ Cleaner Code          | Avoids `if-else` chains.                         |
| ✅ Reusability           | Strategies are reusable in different contexts.   |

 */ 
