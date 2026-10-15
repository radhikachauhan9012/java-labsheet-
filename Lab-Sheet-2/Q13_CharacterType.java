import java.util.Scanner;

public class Q13_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        String type = Character.isDigit(ch) ? "Digit"
                : ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
                ? ("aeiouAEIOU".indexOf(ch) >= 0 ? "Vowel" : "Consonant")
                : "Special symbol");
        System.out.println("Character type = " + type);
        sc.close();
    }
}
