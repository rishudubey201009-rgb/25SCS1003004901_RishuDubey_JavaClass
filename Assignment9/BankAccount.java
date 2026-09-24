class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    public static void main(String[] args) {
        BankAccount account1 =new BankAccount(101, "Rishu", 50000);
        BankAccount account2 =new BankAccount(102, "Rahul", 75000);
        BankAccount account3 =new BankAccount(103, "Aman", 60000);
        System.out.println("Before Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
        BankAccount.interestRate = 6.5;
        System.out.println("After Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}
