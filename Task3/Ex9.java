import java.util.*;

public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input = input.replace("[", "").replace("]", "");
		String[] array = input.split(", ");
		int[] numbers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		System.out.println(differenceMaxMin(numbers));
	}

	public static int differenceMaxMin(int[] num) {
		Arrays.sort(num);
		return num[num.length - 1] - num[0];
	}
}
