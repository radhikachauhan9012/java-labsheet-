import java.util.Scanner;

public class Q09_ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price and selling price: ");
        double costPrice = sc.nextDouble(), sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.printf("Profit = %.2f%n", sellingPrice - costPrice);
        } else if (sellingPrice < costPrice) {
            System.out.printf("Loss = %.2f%n", costPrice - sellingPrice);
        } else {
            System.out.println("No profit, no loss.");
        }
        sc.close();
    }
}
