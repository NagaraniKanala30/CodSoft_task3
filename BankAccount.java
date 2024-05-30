package coding1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Your current balance is " + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please try again.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + balance);
    }
}
