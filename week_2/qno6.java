
import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}