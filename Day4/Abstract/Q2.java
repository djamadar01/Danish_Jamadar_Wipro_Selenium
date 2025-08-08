package abstractt;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

abstract class Account implements Bank {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "deposited");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " withdrawn from SavingsAccount. ");
        } else {
            System.out.println("Withdrawal denied! Minimum balance of " + MIN_BALANCE );
        }
    }
}

class CurrentAccount extends Account {
    private static final double LIMIT = -5000.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= LIMIT) {
            balance -= amount;
            System.out.println(amount + " withdrawn from CurrentAccount");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Bank savings = new SavingsAccount("SA123", 5000);
        Bank current = new CurrentAccount("CA456", 2000);

        System.out.println("Savings Account");
        savings.deposit(2000);
        savings.withdraw(5500);
        savings.withdraw(3000);
        System.out.println("Final Balance : " + savings.getBalance());

        System.out.println("Current Account");
        current.deposit(1000);
        current.withdraw(4000);
        current.withdraw(4000);
        current.withdraw(5000);
        System.out.println("Final Balance : " + current.getBalance());
    }
}

