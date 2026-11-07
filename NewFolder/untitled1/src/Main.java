public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] numbers = new int[]{1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        String[] words = {"яблоко", "банан", "вишня"};
        //Задача 2
        System.out.println("Прямой порядок:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 3

        System.out.println("Обратный порядок:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {   // если число нечётное
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.print("Преобразованный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}