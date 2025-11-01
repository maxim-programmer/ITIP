import java.util.*;
public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		input = input.replaceAll("\\s", "");
		String[] parts = input.split("\\],\\[");
		String aPart = parts[0].replaceAll("[\\[\\]]", "");
		String bPart = parts[1].replaceAll("[\\[\\]]", "");
		String[] a = aPart.isEmpty() ? new String[0] : aPart.split(",");
        	String[] b = bPart.isEmpty() ? new String[0] : bPart.split(",");
		int[] num1 = new int[a.length];
		int[] num2 = new int[b.length];
		for (int i = 0; i < a.length; i++) {
			num1[i] = Integer.parseInt(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
                        num2[i] = Integer.parseInt(b[i]);
                }
		int[] result = mergeUniqueSorted(num1, num2);
		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i != result.length - 1) System.out.print(",");
		}
		System.out.print("]");
	}
	public static int[] mergeUniqueSorted(int[] a, int[] b) {
		int[] combined = new int[a.length + b.length];
		System.arraycopy(a, 0, combined, 0, a.length);
		System.arraycopy(b, 0, combined, a.length, b.length);
		if (combined.length == 0) return new int[0];
		Arrays.sort(combined);
		int[] unique = new int[combined.length];
		unique[0] = combined[0];
		int count = 1;
		for (int i = 1; i < combined.length; i++) {
			if (combined[i] != combined[i - 1]) {
				unique[count] = combined[i];
				count++;
			}
		}
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = unique[i];
		}
		return array;
	}
}
