//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1

        int firstFriday = 3;
        for (int day = 1; day <= 31; day++) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        //Задача 2

        int marathon = 42195;
        int distance1 = 0;
        do {
            System.out.println("Держитесь! Осталось " + (marathon - distance1) + " метров");
            distance1 += 500;
        } while (distance1 <= marathon);
        for (int distance2 = 0; distance2 <= marathon; distance2 += 500) {
            System.out.println("Держитесь! Осталось " + (marathon - distance2) + " метров");
        }

        //Задача 3

        int budget = 1000;
        int day1 = 1;
        int currentBudget1 = budget;

        while (currentBudget1 > 0) {
            if (day1 % 5 == 0) {
                day1++;
                continue;
            }
            currentBudget1 -= 100;
            day1++;
        }
        System.out.println("Бюджета хватит на " + (day1 - 1) + " дней.");
        int currentBudget2 = budget;
        int day2;
        for (day2 = 1; currentBudget2 > 0; day2++) {
            if (day2 % 5 == 0) {
                continue;
            }
            currentBudget2 -= 100;
        }
        System.out.println("Бюджета хватит на " + (day2 - 1) + " дней.");


        //Задача 4


        int month = 0;
        double total = 0;
        double goal = 12000000;

        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц " + month + ", сумма накоплений: " + Math.round(total) + " ₽");
            if (total >= goal) {
                System.out.println("Цель достигнута!");
                break;
            }
        }


        //Задача 5


        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Внимание: перегрев на " + minute + " минуте! Пауза 2 минуты.");
                minute += 2;
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");

    }
}
