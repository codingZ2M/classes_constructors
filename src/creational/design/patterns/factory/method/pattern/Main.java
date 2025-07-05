package creational.design.patterns.factory.method.pattern;


public class Main {
	
    public static void main(String[] args) {
    	
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.notifyUser(); // Output: Sending SMS Notification
        
    }
}
