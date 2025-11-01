import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		String[] parts = input.split("\\],\\s*");
		int k = Integer.parseInt(parts[1].trim());
		String arrayPart = parts[0].replaceAll("[\\[\\]\\s]", "");
      	 	int[] numbers;
        	if (arrayPart.isEmpty()) {
            		numbers = new int[0];
        	} else {
            		String[] numStrings = arrayPart.split(",");
            		numbers = new int[numStrings.length];
            		for (int i = 0; i < numStrings.length; i++) {
                		numbers[i] = Integer.parseInt(numStrings[i]);
			}
            	}
		int[] rotate = rotateRight(numbers, k);
		System.out.println(Arrays.toString(rotate));
	}
	public static int[] rotateRight(int[] arr, int k) {
		int n = arr.length;
		if (n == 0) return arr;
		k %= n;
		if (k == 0) return arr;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[(i + k) % n] = arr[i];
		}
		return result;
	}
}
