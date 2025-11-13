import java.util.*;

public class Ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input = input.replace("[", "").replace("]", "");
		String[] array = input.split(", ");
		int[] numbers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		int[] result = filterEven(numbers);
		System.out.println(Arrays.toString(result));

	}

	public static int[] filterEven(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				result[index] = num[i];
				index++;
			}
		}
		return result;
	}
}
