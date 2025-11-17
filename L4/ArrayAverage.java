public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5.2"};

        double sum = 0;
        int count = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                double num = Double.parseDouble(arr[i]);
                sum += num;
                count++;
            }

            double average = sum / count;
            System.out.println("Среднее арифметическое: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива!");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа в массиве!");
        }
    }
}
