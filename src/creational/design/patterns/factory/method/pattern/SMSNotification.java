package creational.design.patterns.factory.method.pattern;


class SMSNotification implements Notification {
	
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
