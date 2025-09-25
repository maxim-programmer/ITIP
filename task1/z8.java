import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}