package interview_prgrams.oops;

// Derived class: Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4% annual

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}