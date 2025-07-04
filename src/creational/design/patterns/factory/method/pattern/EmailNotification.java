package creational.design.patterns.factory.method.pattern;


class EmailNotification implements Notification {

	public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}
