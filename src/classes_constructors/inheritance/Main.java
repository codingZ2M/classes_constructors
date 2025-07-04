package classes_constructors.inheritance;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 1001, 90000.0, 5);
        Engineer e = new Engineer("Bob", 1002, 75000.0, "Backend");
        Intern i = new Intern("Charlie", 1003, 15000.0, 6);

        m.displayDetails();
        System.out.println("------------------");

        e.displayDetails();
        System.out.println("------------------");

        i.displayDetails();
    }
}
