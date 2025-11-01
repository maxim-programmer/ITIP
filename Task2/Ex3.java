import java.util.Scanner;

public class Ex3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] parts = input.split(", ");
		int[] numbers = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			numbers[i] = Integer.parseInt(parts[i]);
		}
		int total = sumOfPositives(numbers);
		System.out.println(total);
		in.close();
	}
	public static int sumOfPositives(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			if (num > 0) {
				sum += num;
			}
		}
		return sum;
	}
}
