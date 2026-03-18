
import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you have medical cause? (y/n): ");
        char ch = sc.next().charAt(0);

        if(ch == 'y'){
            System.out.println("You are not allowed to sit in the exam");
        }
        else if(ch == 'n'){
            System.out.println("You can sit in the exam");
        }
    }
}