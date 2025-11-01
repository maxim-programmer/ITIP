import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		input = input.replaceAll("\\s", "").replaceAll("\\[\\[", "").replaceAll("]]", "");
		String[] rows = input.split("\\],\\[");
		int n = rows.length;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] nums = rows[i].split(",");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(nums[j]);
			}
		}
		System.out.println(diagonalSum(matrix));
	}
	public static int diagonalSum(int[][] matrix) {
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			total += matrix[i][i];
		}
		return total;
	}
}
