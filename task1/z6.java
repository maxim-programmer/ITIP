import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(checkAge(age));
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "совершеннолетний";
        } else {
            return "несовершеннолетний";
        }
    }
}