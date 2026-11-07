import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        checkLeapYear(2020);
        checkLeapYear(2021);
        checkLeapYear(1900);
        checkLeapYear(2000);

        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        suggestAppVersion(0, 2014);
        suggestAppVersion(1, 2016);
        suggestAppVersion(0, 2015);
        suggestAppVersion(1, 2010);

        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);

        System.out.println("Потребуется дней: " + calculateDeliveryDays(15));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(45));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(75));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(150));
    }

    // Задача 1

    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        String osName = (osType == 0) ? "iOS" : "Android";

        if (deviceYear < 2015 || deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName);
        }
    }

    // Задача 3

    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return -1;
        }

        int days = 1;

        if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        return days;
    }
}