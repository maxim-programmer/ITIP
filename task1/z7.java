import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(average(a, b, c));
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}