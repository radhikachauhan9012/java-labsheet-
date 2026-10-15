import java.util.Scanner;

public class Q08_SquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double length = sc.nextDouble(), breadth = sc.nextDouble();

        if (length > 0 && breadth > 0 && length == breadth) {
            System.out.println("It is a square.");
        } else if (length > 0 && breadth > 0) {
            System.out.println("It is a rectangle.");
        } else {
            System.out.println("Length and breadth must be positive.");
        }
        sc.close();
    }
}
