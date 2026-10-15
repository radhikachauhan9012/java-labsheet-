public class Q18_FibonacciForLoop {
    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.print("First 20 Fibonacci terms: ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(first + (i < 20 ? " " : ""));
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
