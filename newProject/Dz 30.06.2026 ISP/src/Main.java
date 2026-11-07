//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        //Задача 4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задача 5

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        //Задача 6

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        //Задача 7

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        //Задача 8

        int monthlySavings = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задача 9

        int monthlySavings1 = 29000;
        double totalSavings1 = 0;
        double monthlyRate1 = 0.01;
        for (int month = 1; month <= 12; month++) {
            totalSavings1 = totalSavings1 + totalSavings1/100;
            totalSavings1 = totalSavings1 + monthlySavings1;
            totalSavings1 = totalSavings1 * (1 + monthlyRate1);
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + Math.round(totalSavings) + " рублей");
        }

        //Задача 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}
