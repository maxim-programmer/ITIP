import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = digitSum(number);
        System.out.println(result);
    }

    public static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}