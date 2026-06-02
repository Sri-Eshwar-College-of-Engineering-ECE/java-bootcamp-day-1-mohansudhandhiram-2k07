public class BankAccount {
    
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit() {
        System.out.println("Current Balance: " + balance);
        
        
        int depositAmount = 2000;
        System.out.println("Deposit Amount: " + depositAmount);
        
        
        balance += depositAmount;
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        account.deposit();
    }
}