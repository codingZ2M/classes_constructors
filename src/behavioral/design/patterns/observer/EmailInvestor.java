package behavioral.design.patterns.observer;

// Concrete Observer
public class EmailInvestor implements Observer {
    private String email;

    public EmailInvestor(String email) {
        this.email = email;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("📧 Email to " + email + ": " + stockName + " is now ₹" + price);
    }
}
