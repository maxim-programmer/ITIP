import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(avg(a, b, c));
    }

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}