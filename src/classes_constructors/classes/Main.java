package classes_constructors.classes;

public class Main {

	public static void main(String[] args) {
		
		  BankAccount account1 = new BankAccount("Aarav Mehta", "ACC123", 5000);
	        account1.deposit(2000);
	        account1.withdraw(1500);
	        account1.displayBalance();
	        
	        BankAccount account2 = new BankAccount("Aarav Mehta", "ACC125", 5000);
	        account2.deposit(2000);
	        account2.withdraw(1500);
	        account2.displayBalance();

	}

}
