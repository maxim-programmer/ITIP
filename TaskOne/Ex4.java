import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = bolNum(num);
        System.out.println(res);
    }

    public static boolean bolNum(int num) {
        return num % 2 == 0;
    }
}