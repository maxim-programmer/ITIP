import java.util.Scanner;

public class Ex1 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count = countDivisors(x);
		System.out.println(count);
	}

	public static int countDivisors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
}
