class BankAccountDetails {

    // Field declaration

    private double balance;

    // Constructor

    public BankAccountDetails(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("DEPOSITED : " + amount);
        } else {
            System.out.println("DEPOSIT AMOUNT MUST BE POSITIVE.");
        }
    }

    // Method to withdraw money

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("WITHDRAWN : " + amount);
        } else if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            System.out.println("WITHDRAWAL AMOUNT MUST BE POSITIVE.");
        }
    }

    // Method to display balance

    public void displayBalance() {
        System.out.println("CURRENT BALANCE : " + balance);
    }

}

public class BankAccount {

    // Main method

    public static void main(String[] args) {

        // Creating an object of the class

        BankAccountDetails account1 = new BankAccountDetails(1000);

        // Calling the method to display balance

        account1.displayBalance();

        // Calling the method to deposit and withdraw money

        account1.deposit(500);
        account1.displayBalance();
        account1.withdraw(200);
        account1.displayBalance();
        account1.withdraw(600);
        account1.displayBalance();

    }
}
