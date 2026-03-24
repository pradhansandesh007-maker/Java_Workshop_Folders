package javaweek3;

public class qno7 {
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    qno7(int accountNumber, double balance, String name, String address) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = name;
        this.accountHolderAddress = address;
    }

    public static void main(String[] args) {
        qno7 acc1 = new qno7(123456, 5000, "Sandesh Pradhan", "Kathmandu");

        System.out.println("Account Number: " + acc1.accountNumber);
        System.out.println("Balance: " + acc1.balance);
        System.out.println("Name: " + acc1.accountHolderName);
        System.out.println("Address: " + acc1.accountHolderAddress);
    }
}