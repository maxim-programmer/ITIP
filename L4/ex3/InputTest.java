package ex3;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите целое число: ");
            String input = scanner.nextLine();

            if (!isInteger(input)) {
                throw new CustomInputMismatchException("Введённое значение не является числом!");
            }

            int number = Integer.parseInt(input);
            System.out.println("Вы ввели число: " + number);

        } catch (CustomInputMismatchException e) {
            System.out.println("Ошибка: " + e.getMessage());
            ExceptionLogger.logException(e);
        }
    }
    
    private static boolean isInteger(String str) {
        if (str == null) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
