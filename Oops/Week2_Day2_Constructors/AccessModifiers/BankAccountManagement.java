package Week2_Day2_Constructors.AccessModifiers;

import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountManagement extends BankAccount {
    public BankAccountManagement(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccountManagement acc = new BankAccountManagement(accNo, holder, bal);
        acc.display();

        System.out.print("Enter new balance to update: ");
        bal = sc.nextDouble();
        acc.setBalance(bal);
        acc.display();
        sc.close();
    }
}
