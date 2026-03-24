package javaweek3;

public class qno10 {
    int accountNumber;
    private double balance;
    String accountHolderName;
    String accountHolderAddress;

    qno10(int accountNumber, double balance, String name, String address) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = name;
        this.accountHolderAddress = address;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        qno10 acc1 = new qno10(123456, 5000, "Sandesh Pradhan", "Kathmandu");

        System.out.println("Balance: " + acc1.getBalance());
    }
}