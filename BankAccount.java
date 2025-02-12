// BankAccount.java
public class BankAccount {
    // Private attributes (Encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor to initialize values
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder; // Assigns values to object
        this.balance = balance;
    }

    // Method to get balance (Encapsulation)
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Fixed the error here
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}
