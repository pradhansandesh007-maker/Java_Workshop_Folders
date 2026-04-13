package week6;

import java.util.*;

class q1 {
    public static void main(String[] args) {

        // Students list
        ArrayList<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Shyam");
        students.add("Hari");

        students.remove("Shyam");

        System.out.println("Students List: " + students);

        // Examinee list
        ArrayList<String> examinee = new ArrayList<>();
        examinee.add("A");
        examinee.add("B");
        examinee.add("C");
        examinee.add("D");
        examinee.add("E");

        examinee.remove("C");

        System.out.println("Updated Examinee List: " + examinee);
    }
}