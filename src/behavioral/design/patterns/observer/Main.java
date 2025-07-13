package behavioral.design.patterns.observer;

// Client
public class Main {
    public static void main(String[] args) {
    	
        Stock tesla = new Stock("Tesla", 900.0);

        Observer investor1 = new EmailInvestor("alice@example.com");
        Observer investor2 = new MobileAppInvestor("bob_user");

        tesla.addObserver(investor1);
        tesla.addObserver(investor2);

        // Simulate price changes
        tesla.setPrice(910.0); // All observers notified
        tesla.setPrice(920.5); // All observers notified again
    }
}

