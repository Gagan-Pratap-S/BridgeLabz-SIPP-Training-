package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;



public class BankAccountSystem {
    static String bankName = "Axis Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    public BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccountSystem a1 = new BankAccountSystem("Amit", 1001);
        BankAccountSystem a2 = new BankAccountSystem("Riya", 1002);
        a1.displayDetails();
        a2.displayDetails();
        getTotalAccounts();
    }
}