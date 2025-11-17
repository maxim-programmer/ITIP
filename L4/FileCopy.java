import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try {
            File src = new File(sourceFile);
            File dst = new File(destinationFile);

            if (!src.exists()) {
                throw new FileNotFoundException("Исходный файл не найден: " + src.getAbsolutePath());
            }

            if (!src.canRead()) {
                throw new IOException("Нет прав для чтения файла: " + src.getAbsolutePath());
            }

            if (!dst.exists()) {
                throw new FileNotFoundException("Файл назначения не существует: " + dst.getAbsolutePath());
            }

            if (!dst.canWrite()) {
                throw new IOException("Нет прав для записи в файл: " + dst.getAbsolutePath());
            }

            System.out.println("Файл source.txt успешно открыт для чтения.");
            System.out.println("Файл destination.txt успешно открыт для записи.");

            try (FileReader fr = new FileReader(src);
                 FileWriter fw = new FileWriter(dst)) {

                int c;
                while ((c = fr.read()) != -1) {
                    fw.write(c);
                    fw.close();

                }

                System.out.println("Файл успешно скопирован!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи: " + e.getMessage());
        }
    }
}
