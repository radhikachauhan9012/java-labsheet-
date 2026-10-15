import java.util.Scanner;

public class Q02_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double interest = amount - principal;
        System.out.printf("Compound interest = %.2f%n", interest);
        sc.close();
    }
}
