import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split("");
		int result = countVowels(array);
		System.out.println(result);
	}
	public static int countVowels(String[] array) {
		int count = 0;
		String str2 = "AEIOU";
		String str = "aeiou";
		for (int i = 0; i < array.length; i++) {
			if (str.contains(array[i]) || str2.contains(array[i])) {
				count++;
			}
		}
		return count;
	}
}
