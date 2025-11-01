import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String score = grade(x);
		System.out.println(score);
	}

	public static String grade(int x) {
		if (x >= 90 && x <= 100) {
			return "A";
		}
		else if (x >= 80 && x <= 89) {
			return "B";
		}
		else if (x >= 70 && x <= 79) {
			return "C";
		}
		else if (x >= 60 && x <= 69) {
			return "D";
		}
		else if ( x >= 0 && x <= 59) {
			return "F";
		}
		else {
			return "Invalid";
		}
	}
}
