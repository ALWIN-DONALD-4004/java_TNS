package project3;

//Static part: Bank class with a static variable
class Bank {
 private static int totalAccounts = 0;

 // Static method to get the current value of totalAccounts
 public static int getTotalAccounts() {
     return totalAccounts;
 }

 // Increment totalAccounts each time an account is created
 public static void incrementTotalAccounts() {
     totalAccounts++;
 }
}

//Abstract class for Account with common functionality
abstract class Account {
 protected double balance;

 // Constructor to set initial balance
 public Account(double balance) {
     this.balance = balance;
     Bank.incrementTotalAccounts(); // Increase total accounts when a new account is created
 }

 // Abstract methods for deposit, withdraw, and getBalance
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 // Concrete method for displaying balance
 public void displayBalance() {
     System.out.println("Current Balance: " + getBalance());
 }
}

//SavingsAccount subclass with specific functionality
class SavingsAccount extends Account {
 private static final double INTEREST_RATE = 0.05; // 5% interest rate

 public SavingsAccount(double balance) {
     super(balance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }

 // Method to apply interest
 public void applyInterest() {
     balance += balance * INTEREST_RATE;
 }
}

//CheckingAccount subclass with overdraft functionality
class CheckingAccount extends Account {
 private static final double OVERDRAFT_LIMIT = 500.0; // Overdraft limit

 public CheckingAccount(double balance) {
     super(balance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance + OVERDRAFT_LIMIT >= amount) {
         balance -= amount;
     } else {
         System.out.println("Overdraft limit exceeded!");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

//Final class for handling transactions with a transaction fee
final class Transaction {
 private final String transactionType;
 private final double amount;
 private static final double transactionFee = 10.0; // Fixed fee for each transaction

 public Transaction(String transactionType, double amount) {
     this.transactionType = transactionType;
     this.amount = amount;
 }

 // Final method to perform the transaction
 public final void performTransaction(Account account) {
     switch (transactionType.toLowerCase()) {
         case "deposit":
             account.deposit(amount - transactionFee); // Apply transaction fee
             break;
         case "withdraw":
             account.withdraw(amount + transactionFee); // Apply transaction fee
             break;
         default:
             System.out.println("Invalid transaction type");
     }
 }

 // Final method to display transaction details
 public final void displayTransaction() {
     System.out.println("Transaction Type: " + transactionType);
     System.out.println("Amount: " + amount);
     System.out.println("Transaction Fee: " + transactionFee);
 }
}

//Main class to test the Banking Transaction System
public class BankDemo {
 public static void main(String[] args) {
     // Create a SavingsAccount and perform transactions
     SavingsAccount savings = new SavingsAccount(1000);
     Transaction depositTransaction = new Transaction("deposit", 500);
     depositTransaction.performTransaction(savings);
     savings.applyInterest();
     savings.displayBalance();
     

     // Create a CheckingAccount and perform transactions
     CheckingAccount checking = new CheckingAccount(1000);
     Transaction withdrawTransaction = new Transaction("withdraw", 500);
     withdrawTransaction.performTransaction(checking);
     checking.displayBalance();

     // Display total accounts created
     System.out.println("Total Accounts Created: " + Bank.getTotalAccounts());
 }
}

