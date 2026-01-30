package interview_prgrams.oops;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA123", 10000);
        BankAccount acc2 = new CurrentAccount("CA456", 20000);

        acc1.printDetails();
        System.out.println("Interest: " + acc1.calculateInterest());

        acc2.printDetails();
        System.out.println("Interest: " + acc2.calculateInterest());

        // Polymorphism in action
        BankAccount[] accounts = {acc1, acc2};
        for (BankAccount acc : accounts) {
            System.out.println(acc.accountNumber + " interest: " + acc.calculateInterest());
        }
    }
}
