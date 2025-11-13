import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split("");
		int result = countWords(array);
		System.out.println(result);
	}
	public static int countWords(String[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1].equals(" ") && (!(arr[i].equals(" ")))) {
				count++;
			}
		}
		if (!(arr[0].equals(" "))) {
			count++;
		}
		return count;
	}
}
