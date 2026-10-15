import java.util.Scanner;
public class Q06_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) { a[i] = sc.nextInt(); b[i] = a[i]; }
        System.out.print("Copied array: ");
        for (int x : b) System.out.print(x + " ");
        sc.close();
    }
}
