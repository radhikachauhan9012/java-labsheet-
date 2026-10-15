import java.util.Scanner;

public class Q16_ShiftMultiplyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Multiplied by 8 using left shift = " + (number << 3));
        System.out.println("Divided by 4 using right shift = " + (number >> 2));
        sc.close();
    }
}
