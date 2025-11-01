import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int total = sumRange(a, b);
		System.out.println(total);
		in.close();
	}

	public static int sumRange(int a, int b) {
		int total = 0;
		for (int i = a; i <= b; i++) {
			total += i;
		}
		return total;
	}
}
