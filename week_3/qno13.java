package javaweek3;

public class qno13 {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public qno13() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0.0;
        System.out.println("qno13 created with default values.");
    }

    public qno13(double balance) {
        this.balance = balance;
        accountNumber = 0;
        accountHolderName = "Unknown";
    }

    public qno13(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = 0.0;
    }

    public qno13(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        qno13 acc1 = new qno13();
        System.out.println("Balance acc1: " + acc1.getBalance());

        qno13 acc2 = new qno13(5000);
        System.out.println("Balance acc2: " + acc2.getBalance());

        qno13 acc3 = new qno13(101, "Sandesh");
        System.out.println("Account Name acc3: " + acc3.getAccountHolderName());

        qno13 acc4 = new qno13(102, "Anita", 10000);
        System.out.println("Account Name acc4: " + acc4.getAccountHolderName() + ", Balance: " + acc4.getBalance());
    }
}