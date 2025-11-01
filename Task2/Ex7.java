import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();
		int[] array = countEvenOddDigits(x);
		System.out.println(array[0] + ", " + array[1]);
	}
	public static int[] countEvenOddDigits(int n) {
		n = Math.abs(n);
		int even = 0;
		int odd = 0;
		if (n == 0) {
			even = 1;
		} else {
			while (n > 0) {
				int digit = n % 10;
				if (digit % 2 == 0) {
					even++;
				} else {
					odd++;
				}
				n /= 10;
			}
		}
		return new int[]{even, odd};
	}
}
