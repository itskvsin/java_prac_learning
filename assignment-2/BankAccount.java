/*
 * 3. Bank Account Management System
      Write a Java program using inheritance and polymorphism to model a banking system:
         Create an abstract class BankAccount with attributes accountNumber, accountHolderName, and balance.
         Include abstract methods deposit(double amount) and withdraw(double amount).
         Create subclasses SavingsAccount and CurrentAccount with specific withdrawal rules.
         In the main method, store multiple accounts in an array and perform deposits/withdrawals using dynamic
          method dispatch.
 * 
 */

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(
            String accountNumber,
            String accountHolderName,
            double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Holder Name: " + this.accountHolderName);
        System.out.printf("Balance: ₹%.2f\n", this.balance);
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new SavingsAccount("k105", "Kevin", 1500.0);
        accounts[1] = new CurrentAccount("n102", "new", 2000.0);

        System.out.println("Collecting Data");

        for (BankAccount acc : accounts) {
            System.out.println("\nProcessing account for: " + acc.accountHolderName);
            acc.displayAccountInfo();

            acc.deposit(200.0);
            acc.withdraw(100.0);
            acc.withdraw(1500.0);
        }

    }
}

class SavingsAccount extends BankAccount {

    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(
            String accountNumber,
            String accountNameHolder,
            double initialBalance) {
        super(accountNumber, accountNameHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("\nAdded Balance of ruppes: %.2f \n Total balance: %.2f", amount, this.balance);
        } else {
            System.out.println("Please enter valid amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= MIN_BALANCE) {
            this.balance -= amount;
            System.out.printf("\n amount %.2f has been deducted \n Total Balance: %.2f \n", amount, this.balance);
        } else {
            System.out.println("Unable to withdraw insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 10.0;

    public CurrentAccount(
            String accountNumber,
            String accountNameHolder,
            double initialBalance) {
        super(accountNumber, accountNameHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= (TRANSACTION_FEE + amount)) {
            this.balance -= (TRANSACTION_FEE + amount);
            System.out.printf("\n amount %.2f has been deducted \n Total Balance: %.2f \n", amount, this.balance);
        } else {
            System.out.println("Invalid Balance");
        }
    }
}
