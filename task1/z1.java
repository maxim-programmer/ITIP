import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = toFahrenheit(celsius);
        System.out.println(fahrenheit);
    }
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

}