package creational.design.patterns.factory.method.pattern;


class SMSNotification implements Notification {
	
	@Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
	
}
