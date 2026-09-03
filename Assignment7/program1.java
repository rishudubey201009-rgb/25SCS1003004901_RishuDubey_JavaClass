class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()
                && accountNumber.length() >= 5)
            this.accountNumber = accountNumber;
         else 
            System.out.println("Invalid Account Number");   
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()
                && accountHolderName.length() >= 3) 
            this.accountHolderName = accountHolderName;
         else 
            System.out.println("Invalid Account Holder Name");
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) 
            this.balance = balance;
        else 
            System.out.println("Invalid Balance");   
    }
    public void deposit(double amount) {
        if (amount > 0) 
            balance = balance + amount;
        else 
            System.out.println("Invalid Deposit Amount");
    }
    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid Withdrawal Amount");
        else if (amount > balance) 
            System.out.println("Insufficient Balance");
        else 
            balance = balance - amount;
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}
public class program1 {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("ACC1001", "Rishu Dubey", 5000.0);
        account.displayAccountDetails();
        System.out.println("Depositing: 2000");
        account.deposit(2000);
        System.out.println("Withdrawal: 3000");
        account.withdraw(3000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}