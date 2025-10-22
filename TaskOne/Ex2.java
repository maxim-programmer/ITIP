import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area = rectangleArea(length, width);
        System.out.println(area);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }
}