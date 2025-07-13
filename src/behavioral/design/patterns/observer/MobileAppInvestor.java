package behavioral.design.patterns.observer;

// Another Observer
public class MobileAppInvestor implements Observer {
    private String username;

    public MobileAppInvestor(String username) {
        this.username = username;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("📱 App alert for " + username + ": " + stockName + " is now ₹" + price);
    }
}

