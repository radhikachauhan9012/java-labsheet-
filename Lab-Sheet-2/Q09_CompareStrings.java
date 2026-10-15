import java.util.Scanner;

public class Q09_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String first = sc.next();
        System.out.print("Enter second word: ");
        String second = sc.next();

        int i = 0;
        int result = 0;
        while (i < first.length() && i < second.length()) {
            char a = first.charAt(i);
            char b = second.charAt(i);
            if (a < b) { result = -1; break; }
            if (a > b) { result = 1; break; }
            i++;
        }
        if (result == 0) {
            if (first.length() < second.length()) result = -1;
            else if (first.length() > second.length()) result = 1;
        }

        if (result < 0) System.out.println(first + " comes before " + second);
        else if (result > 0) System.out.println(first + " comes after " + second);
        else System.out.println("Both words are equal");
        sc.close();
    }
}
