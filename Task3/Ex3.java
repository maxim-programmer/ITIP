import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input = input.replace("[", "").replace("]", "");
		String[] array = input.split(", ");
		int[] numbers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		System.out.println(secondLargest(numbers));

	}
	public static int secondLargest(int[] arr) {
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != max) {
				return arr[i];
			}
		}
		return max;
	}
}
