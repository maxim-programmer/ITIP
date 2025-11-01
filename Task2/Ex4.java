import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] parts = input.split(", ");
		int[] numbers = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			numbers[i] = Integer.parseInt(parts[i]);
		}
		System.out.println(hasDuplicates(numbers));
	}
	public static boolean hasDuplicates(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
