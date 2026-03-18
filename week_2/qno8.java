
import java.util.Scanner;

public class qno8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Physics: ");
        int p = sc.nextInt();

        System.out.print("Chemistry: ");
        int c = sc.nextInt();

        System.out.print("Biology: ");
        int b = sc.nextInt();

        System.out.print("Mathematics: ");
        int m = sc.nextInt();

        System.out.print("Computer: ");
        int comp = sc.nextInt();

        double percentage = (p+c+b+m+comp)/5.0;

        System.out.println("Percentage = " + percentage);

        if(percentage >= 90)
            System.out.println("Grade A");
        else if(percentage >= 80)
            System.out.println("Grade B");
        else if(percentage >= 70)
            System.out.println("Grade C");
        else if(percentage >= 60)
            System.out.println("Grade D");
        else if(percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}