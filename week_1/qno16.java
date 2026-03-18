
public class qno16 {
    public static void main(String[] args) {

        boolean expr1 = (5 > 3);
        boolean expr2 = (8 > 5);

        System.out.println("Logical AND: " + (expr1 && expr2));

        expr2 = (2 > 5);
        System.out.println("Logical OR: " + (expr1 || expr2));

        boolean expr3 = !(5 == 10);
        System.out.println("Logical NOT: " + expr3);

        // Comparison operators
        System.out.println("5 > 3 : " + (5 > 3));
        System.out.println("5 < 3 : " + (5 < 3));
        System.out.println("5 >= 3 : " + (5 >= 3));
        System.out.println("5 <= 3 : " + (5 <= 3));
        System.out.println("5 == 3 : " + (5 == 3));
        System.out.println("5 != 3 : " + (5 != 3));
    }
}