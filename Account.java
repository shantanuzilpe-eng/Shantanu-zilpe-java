// Abstract class (Abstraction)
abstract class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Encapsulation (Getter method)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Abstract method (must be implemented in child class)
    public abstract void withdraw(double amount);
}


// Inheritance
class SavingsAccount extends BankAccount {
    private double minimumBalance = 500;

    // Using super keyword
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Polymorphism (Method Overriding)
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance must be
