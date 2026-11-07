public class Main {
    public static void main(String[] args) {

        //Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Задача 2

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        //Задача 3

        fullName = "Иванов Семён Семёнович";
        String fullNameWithoutYo = fullName.replace('ё', 'е');
        fullNameWithoutYo = fullNameWithoutYo.replace('Ё', 'Е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameWithoutYo);

    }
}
