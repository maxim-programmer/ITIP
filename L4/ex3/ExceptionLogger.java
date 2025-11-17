package ex3;
import java.io.*;

public class ExceptionLogger {
    private static final String LOG_FILE = "exceptions.log";

    public static void logException(Exception e) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            pw.println("Исключение: " + e.getClass().getName());
            pw.println("Сообщение: " + e.getMessage());
            pw.println("-------------------------");
        } catch (IOException ioException) {
            System.out.println("Ошибка при записи лог-файла: " + ioException.getMessage());
        }
    }
}