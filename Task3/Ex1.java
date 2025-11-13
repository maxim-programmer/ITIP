import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String[] words = word.split(" ");
		String[] result = reverseWords(words);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i != result.length - 1) {
				System.out.print(" ");
			}
		}

	}
	public static String[] reverseWords(String[] words) {
		String[] revWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			revWords[words.length - i - 1] = words[i];
		}
		return revWords;
	}
}
