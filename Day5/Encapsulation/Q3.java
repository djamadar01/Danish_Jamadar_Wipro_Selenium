package enacpul;
import java.util.ArrayList; 

import java.util.List; 

class Transaction { 

    String type; 

    double amount; 

    Transaction(String type, double amount) { 

        this.type = type; 

        this.amount = amount; 

    } 

    public String toString() { 

        return type + ": ₹" + amount; 

    } 

} 

public class Q3 { 

    private String accountNumber; 

    private String accountHolder; 

    private double balance; 

    private List<Transaction> transactionHistory = new ArrayList<>(); 

    public Q3(String accountNumber, String accountHolder, double initialBalance) { 

        this.accountNumber = accountNumber; 

        this.accountHolder = accountHolder; 

        this.balance = initialBalance; 

    } 

    public void deposit(double amount) { 

        if (amount > 0) { 

            balance += amount; 

            transactionHistory.add(new Transaction("Deposit", amount)); 

            System.out.println("Deposit successful."); 

        } else { 

            System.out.println("Invalid deposit amount."); 

        } 

    } 

    public boolean withdraw(double amount) { 

        if (amount > 0 && amount <= balance) { 

            balance -= amount; 

            transactionHistory.add(new Transaction("Withdraw", amount)); 

            System.out.println("Withdrawal successful."); 

            return true; 

        } else { 

            System.out.println("Insufficient funds or invalid amount."); 

            return false; 

        } 

    } 

    public double getBalance() { 

        return balance; 

    } 

    public String getLastTransaction() { 

        if (transactionHistory.isEmpty()) { 

            return "No transactions yet."; 

        } 

        return transactionHistory.get(transactionHistory.size() - 1).toString(); 

    } 

    public String toString() { 

        String masked = "****" + accountNumber.substring(accountNumber.length() - 4); 

        return "Account Holder: " + accountHolder + 

                "\nAccount Number: " + masked + 

                "\nBalance: ₹" + balance; 

    } 

    public static void main(String[] args) { 

        Q3 account = new Q3("1234", "Danish", 5000.0); 

        System.out.println(account); 

        account.deposit(1000); 

        account.withdraw(2000); 

        account.withdraw(5000); 

        System.out.println("\nCurrent Balance: ₹" + account.getBalance()); 

        System.out.println("Last Transaction: " + account.getLastTransaction()); 

        System.out.println("\n" + account); 

    } 

} 
