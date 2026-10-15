import java.util.Scanner;

public class Q06_HalvingSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double number = sc.nextDouble();
        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }
        System.out.println("Number of steps = " + steps);
        System.out.printf("Final value = %.4f%n", number);
        sc.close();
    }
}
