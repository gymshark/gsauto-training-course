package session6classes.examples;

// Define a class called BankAccount
public class BankAccount {

  // Private fields (Encapsulation)
  private final String accountNumber;
  private double balance;

  // Public constructor
  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  // Public method to deposit money
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Invalid deposit amount");
    }
  }

  // Public method to withdraw money
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: $" + amount);
    } else {
      System.out.println("Invalid withdraw amount or insufficient funds");
    }
  }

  // Getter for balance (read-only access)
  public double getBalance() {
    return balance;
  }

  // Getter for accountNumber (read-only access)
  public String getAccountNumber() {
    return accountNumber;
  }

  public static void main(String[] args) {
    // Creating objects of BankAccount class
    BankAccount account1 = new BankAccount("12345", 1000.0);

    // Displaying initial balance
    System.out.println("Account Number: " + account1.getAccountNumber());
    System.out.println("Initial Balance: $" + account1.getBalance());

    // Performing deposit and withdraw operations
    account1.deposit(500.0);
    account1.withdraw(200.0);

    // Displaying final balance
    System.out.println("Final Balance: $" + account1.getBalance());
  }
}
