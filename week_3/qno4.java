package javaweek3;

//Main class to test
public class qno4 {
 public static void main(String[] args) {

     // Create object of BankAccount
     BankAccount acc1 = new BankAccount();

     // Initialize attributes
     acc1.accountNumber = 123456;
     acc1.balance = 5000.0;
     acc1.accountHolderName = "Sandesh Pradhan";
     acc1.accountHolderAddress = "Kathmandu";

     // Display the values
     System.out.println("Account Number: " + acc1.accountNumber);
     System.out.println("Balance: " + acc1.balance);
     System.out.println("Account Holder Name: " + acc1.accountHolderName);
     System.out.println("Address: " + acc1.accountHolderAddress);
 }
}