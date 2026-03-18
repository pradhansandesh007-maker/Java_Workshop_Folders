
import java.util.Scanner;

public class qno7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            if(num % 4 == 0)
                System.out.println("Even and divisible by 4");
            else
                System.out.println("Even but not divisible by 4");
        }
        else{
            if(num % 7 == 0)
                System.out.println("Odd and divisible by 7");
            else
                System.out.println("Odd but not divisible by 7");
        }
    }
}