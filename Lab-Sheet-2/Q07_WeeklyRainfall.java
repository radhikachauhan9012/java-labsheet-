import java.util.Scanner;

public class Q07_WeeklyRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Rainfall for day " + day + " (mm): ");
            total += sc.nextDouble();
        }
        System.out.printf("Total rainfall = %.2f mm%n", total);
        sc.close();
    }
}
