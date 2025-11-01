import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(",");
		int value = Integer.parseInt(array[0].trim());
		int min = Integer.parseInt(array[1].trim());
		int max = Integer.parseInt(array[2].trim());
		System.out.println(clamp(value, min, max));
	}
	public static int clamp(int value, int min, int max) {
		if (value < min) {
			return min;
		}
		else if (value > max) {
			return max;
		}
		return value;
	}
}
