import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        System.out.println(daysToWeeks(days));
    }

    public static String daysToWeeks(int days) {
        int weeks = days / 7;
        int remaining = days % 7;
        return weeks + " " + form(weeks, "неделя", "недели", "недель") + " и " + remaining + " " + form(remaining, "день", "дня", "дней");
    }

    public static String form(int n, String one, String two, String five) {
        int a = Math.abs(n);
        int mod100 = a % 100;
        if (mod100 >= 11 && mod100 <= 14) return five;
        int mod10 = a % 10;
        if (mod10 == 1) return one;
        if (mod10 >= 2 && mod10 <= 4) return two;
        return five;
    }
}