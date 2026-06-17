public class BankAccount {
    // Private field (Encapsulation)
    private double balance;
    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }
    // Getter method
    public double getBalance() {
        return balance;
    }
    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Withdraw method
    public void withdraw(double amt) {
        // Checking valid withdrawal conditions
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println( amt + " withdrawn successfully.");
        } else if(amt <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
