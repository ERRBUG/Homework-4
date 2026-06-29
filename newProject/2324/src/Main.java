//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // задание 1


        int age = 18;
        if (age >= 18) {
            System.out.println("Вам уже 18! поздравляем!");
        } else {
            System.out.println("Вам еще нет 18 лет");
        }
        // задание 2


        int temperature = 5;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, желательно надеть шапку");
        } else {
            System.out.println("на улице " + temperature + " Можно идти без шапки");
        }

        int temperature1 = 15;

        if (temperature1 <= 5) {
            System.out.println("На улице " + temperature1 + " градусов, желательно надеть шапку");
        } else {
            System.out.println("на улице " + temperature1 + " Можно идти без шапки");
        }

        // задание 3


        int speed = 75;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int speed1 = 50;

        if (speed1 > 60) {
            System.out.println("Ваша скорость " + speed1 + " заплатите штраф!");
        } else {
            System.out.println("Ваша скорость " + speed1 + " можно ехать спокойно");
        }
        // задание 4

        int ageKid = 15;

        if (ageKid >= 2 && ageKid <= 6) {
            System.out.println("если ваш возраст " + ageKid + " то вы должны ходить в детский сад");
        } else if (ageKid >= 7 && ageKid <= 17) {
            System.out.println("если ваш возраст " + ageKid + " то вы должны ходить в школу");
        } else if (ageKid >= 18 && ageKid <= 24) {
            System.out.println("если ваш возраст " + ageKid + " то вы должны ходить в институт");
        } else if (ageKid > 24) {
            System.out.println("если ваш возраст " + ageKid + " то вы должны ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + ageKid + ", то он ещё слишком мал");

        }
        // задание 5

        int ageChild = 12;
        boolean ageMan = true;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild <= 14) {
            if (ageMan) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе без взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // задание 6

        int humanInTrain = 45;

        int sit = 60;
        int train = 102;

        if (humanInTrain < sit) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (humanInTrain < train) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Вагон полностью забит, мест нет");
        }
        int humanIntrain = 70;

        int siT = 60;
        int traiN = 102;

        if (humanIntrain < siT) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (humanIntrain < traiN) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Вагон полностью забит, мест нет");
        }

        // задание 7

        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Самое большое число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }



    }
}

