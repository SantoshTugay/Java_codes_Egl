package interview_prgrams.oops;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    public void printDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}