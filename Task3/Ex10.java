import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(", ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		System.out.println(isTriangle(a, b, c));
	}
	public static boolean isTriangle(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		return false;
	}
}
