import java.util.Scanner;
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
        if (amount > 0){
            balance = balance + amount;
        System.out.println("Updated Balance: " + getBalance());
         }
        else 
            System.out.println("Invalid Deposit Amount");
    }
    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid Withdrawal Amount ");
        else if (amount > balance) 
            System.out.println("Insufficient Balance");
        else{
            balance = balance - amount;
            System.out.println("Updated Balance: " + getBalance());
         }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name "); 
        String Name=sc.nextLine();  
        System.out.print("Enter you Account number ");
        String account_number=sc.nextLine();    
        BankAccount account = new BankAccount(account_number, Name, 5000.0);
        System.out.print("1)Deposit,2)Withdrawal\nFor deposit enter 1 and for Withdrawal enter 2: "); 
        int a=sc.nextInt();
        account.displayAccountDetails();
        if(a==1){
        System.out.print("Inter the amount you want to Deposit "); 
        int x=sc.nextInt();
        System.out.println("Depositing:"+ x);
        account.deposit(x);
        }else if (a==2){
        System.out.print("Enter the amount you want to withgraw "); 
        int y=sc.nextInt();
            System.out.println("Withdrawal:" + y);
        account.withdraw(y);
        }else System.out.print("invalide input");
    }
}