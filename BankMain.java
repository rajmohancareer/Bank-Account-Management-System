// Step 1: Main class to test BankAccount
public class BankMain {
    public static void main(String[] args) {
        // Step 2: Create an object of BankAccount
        BankAccount myAccount = new BankAccount("Raj Mohan", 5000);

        // Step 3: Display account details
        myAccount.displayAccountInfo();

        // Step 4: Deposit money
        myAccount.deposit(2000);

        // Step 5: Withdraw money
        myAccount.withdraw(3000);

        // Step 6: Try to withdraw more than balance
        myAccount.withdraw(5000);
    }
}
