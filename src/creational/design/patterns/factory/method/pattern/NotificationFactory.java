package creational.design.patterns.factory.method.pattern;

/*  Creational Design Patterns(Factory Method Pattern):	Hide object creation logic
	
	💡 Use When:
		You want to delegate instantiation to subclasses or factory methods.
	
	🎯 Real-World Scenario: Notification System
		Users choose Email or SMS based on preferences. We want to create the appropriate notification without hard coding types
		
	🧠 Why?
		You don’t want the main code to know the exact class names.
		You can add new types (e.g., PushNotification) without changing much.
*/

class NotificationFactory {
	
    public static Notification createNotification(String type) {
    	
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        return null;
    }
}
