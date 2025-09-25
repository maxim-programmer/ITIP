import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = isEven(number);
        System.out.println(result);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}