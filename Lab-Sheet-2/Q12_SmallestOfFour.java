import java.util.Scanner;

public class Q12_SmallestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int smallest = (a < b ? a : b);
        smallest = (smallest < c ? smallest : c);
        smallest = (smallest < d ? smallest : d);
        System.out.println("Smallest number = " + smallest);
        sc.close();
    }
}
