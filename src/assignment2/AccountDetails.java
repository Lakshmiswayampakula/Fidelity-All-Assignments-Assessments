package assignment2;

public class AccountDetails {
    int accountNumber;
    String name;
    double balance;

    public AccountDetails(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account No: " + accountNumber + ", Name: " + name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        AccountDetails Account1 = new AccountDetails(101, "John Doe", 5000.0);
        AccountDetails Account2 = new AccountDetails(102, "Jane Doe", 3000.0);

        Account1.checkBalance();
        Account1.deposit(1500.0);
        Account1.withdraw(2000.0);
        Account1.checkBalance();

        System.out.println();

        Account2.checkBalance();
        Account2.deposit(500.0);
        Account2.withdraw(3500.0);
        Account2.checkBalance();
    }
}