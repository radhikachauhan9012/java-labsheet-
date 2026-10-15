import java.util.Scanner;
public class Q04_MaximumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("Size must be positive."); return; }
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int max = a[0];
        for (int x : a) if (x > max) max = x;
        System.out.println("Maximum element = " + max);
        sc.close();
    }
}
