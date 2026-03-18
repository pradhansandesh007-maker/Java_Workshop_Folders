
import java.util.Scanner;

public class qno14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USD amount: ");
        double usd = sc.nextDouble();

        System.out.print("Enter exchange rate: ");
        double rate = sc.nextDouble();

        double rupees = usd * rate;

        System.out.println("Converted amount: " + rupees);
    }
}