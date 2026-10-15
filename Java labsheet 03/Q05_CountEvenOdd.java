import java.util.Scanner;
public class Q05_CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt(); int even = 0, odd = 0;
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) even++; else odd++;
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
        sc.close();
    }
}
