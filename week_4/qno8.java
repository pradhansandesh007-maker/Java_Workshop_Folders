package week4;
import java.util.*;

public class qno8 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> users = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                signup();
            } else if (choice == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            }
        }
    }

    static void signup() {
        while (true) {

            System.out.print("Enter full name: ");
            String name = sc.nextLine();

            if (name.length() <= 4) {
                System.out.println("Invalid name.");
                continue;
            }

            System.out.print("Enter mobile: ");
            String mobile = sc.nextLine();

            if (!mobile.matches("0\\d{9}")) {
                System.out.println("Invalid mobile.");
                continue;
            }

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (!pass.matches("[A-Za-z]+[@&]\\d+")) {
                System.out.println("Invalid password.");
                continue;
            }

            System.out.print("Confirm password: ");
            String confirm = sc.nextLine();

            if (!pass.equals(confirm)) {
                System.out.println("Passwords not matching.");
                continue;
            }

            System.out.print("Enter DOB (DD/MM/YYYY): ");
            String dob = sc.nextLine();

            if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Invalid DOB.");
                continue;
            }

            int year = Integer.parseInt(dob.substring(6));
            int age = 2026 - year;

            if (age < 21) {
                System.out.println("Must be 21+.");
                continue;
            }

            users.add(name);

            System.out.println("You have successfully signed up.");
            break;
        }
    }
}