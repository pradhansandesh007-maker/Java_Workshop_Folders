package week8;

import java.io.*;
import java.util.*;


public class qno5 {

    static class Student {
        String firstName;
        String lastName;
        String address;
        String contactNumber;
        String semester;

        Student(String firstName, String lastName, String address,
                String contactNumber, String semester) {
            this.firstName     = firstName;
            this.lastName      = lastName;
            this.address       = address;
            this.contactNumber = contactNumber;
            this.semester      = semester;
        }

        String toCSV() {
            return String.format("%s,%s,\"%s\",%s,%s",
                    firstName, lastName, address, contactNumber, semester);
        }
    }

    public static void writeToCSV(List<Student> students, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Header row
            bw.write("FIRST_NAME,LAST_NAME,ADDRESS,CONTACT_NUMBER,SEMESTER");
            bw.newLine();
            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }
            System.out.println("Student data written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 1; i <= count; i++) {
            System.out.println("\n--- Student " + i + " ---");
            System.out.print("First Name     : ");
            String fn = scanner.nextLine();
            System.out.print("Last Name      : ");
            String ln = scanner.nextLine();
            System.out.print("Address        : ");
            String addr = scanner.nextLine();
            System.out.print("Contact Number : ");
            String contact = scanner.nextLine();
            System.out.print("Semester       : ");
            String sem = scanner.nextLine();

            students.add(new Student(fn, ln, addr, contact, sem));
        }

        writeToCSV(students, "students.csv");
        scanner.close();
    }
}