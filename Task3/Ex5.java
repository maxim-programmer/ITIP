import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split(", ");
		String[] word1 = words[0].split("");
		String[] word2 = words[1].split("");
		System.out.println(isAnagram(word1, word2));
	}
	public static boolean isAnagram(String[] arr1,  String[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
}
