import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(season(month));
    }

    public static String season(int month) {
        if (month == 12 || month == 1 || month == 2) return "зима";
        if (month >= 3 && month <= 5) return "весна";
        if (month >= 6 && month <= 8) return "лето";
        if (month >= 9 && month <= 11) return "осень";
        return "неизвестно";
    }
}