package interview_prgrams.oops;

// Derived class: Current Account
class CurrentAccount extends BankAccount {
    private double interestRate = 0.01; // 1% annual

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
