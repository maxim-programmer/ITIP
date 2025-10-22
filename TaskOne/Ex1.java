import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double cels = sc.nextDouble();
        double fah = toFah(cels);
        System.out.println(fah);
    }

    public static double toFah(double cels) {
        return cels * 9.0/5.0 + 32;
    }
}