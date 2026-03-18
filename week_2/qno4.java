
import java.util.Scanner;

public class qno4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of person 1: ");
        int a = sc.nextInt();

        System.out.print("Enter age of person 2: ");
        int b = sc.nextInt();

        System.out.print("Enter age of person 3: ");
        int c = sc.nextInt();

        int oldest = Math.max(a, Math.max(b,c));

        int youngest = Math.min(a, Math.min(b,c));

        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}