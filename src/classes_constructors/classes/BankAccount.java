package classes_constructors.classes;

// Modeling a Bank Account as a class  with three core attributes
public class BankAccount {
    // Fields (state)
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor (how objects are initialized) sets the initial state
    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    // The behaviors — deposit, withdraw, and displaying balance — are modeled through methods.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: ₹" + balance);
    }
}
