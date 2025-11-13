import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		System.out.println(fibonacci(input));
	}

	public static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
