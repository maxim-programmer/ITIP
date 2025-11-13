import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int result = sumOfDigits(input);
		System.out.println(result);
	}
	public static int sumOfDigits(int x) {
		int total = 0;
		while (x > 0) {
			total += x % 10;
			x /= 10;
		}
		return total;
	}
}
