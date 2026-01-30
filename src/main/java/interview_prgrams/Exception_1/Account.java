package interview_prgrams.Exception_1;

public class Account {
    private int balance;

    public Account(int initialBalance){
        this.balance=initialBalance;
    }

    public void deposit(int amount){
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be postive");
        }
        balance+=amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);

    }

    public void withdraw(int amount){
        if(amount<=0){
            throw  new IllegalArgumentException("Amount should be positive");
        }

        if(balance-amount<0){
            try {
                throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance.");
            } catch (InsufficientBalanceException e) {
                throw new RuntimeException(e);
            }
        }
        balance-=amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);

    }

    // Custom Exception
    public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    public int getBalance(){
        return  balance;
    }

    public static void main(String args[]){
        Account a=new Account(5000);
        a.deposit(1000);
        a.withdraw(6000);

    }
}
