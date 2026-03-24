package javaweek3;

//qno12.java
public class qno12 {

 private double balance;  // encapsulated balance

 // Constructor
 public qno12(double b) {
     balance = b;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Main method to demonstrate usage
 public static void main(String[] args) {

     // Create a qno12 object (Bank Account)
     qno12 account = new qno12(5000);

     // Print balance
     System.out.println("Account Balance: " + account.getBalance());
 }
}