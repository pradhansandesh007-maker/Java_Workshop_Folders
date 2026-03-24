package javaweek3;

public class qno5 {

    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    void depositMoney(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        qno5 acc1 = new qno5();

        acc1.balance = 6000;

        acc1.depositMoney(2000);
        acc1.withdrawMoney(3000);
    }
}