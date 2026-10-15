public class Q19_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers from 1 to 1000: ");
        for (int n = 1; n <= 1000; n++) {
            int digits = String.valueOf(n).length();
            int temp = n, sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == n) System.out.print(n + " ");
        }
        System.out.println();
    }
}
