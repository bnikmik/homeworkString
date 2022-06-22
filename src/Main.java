public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1");

        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";

        String fullName  = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(" ");

        //Задание №2
        System.out.println("Задание №2");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println(" ");

        //Задание №3
        System.out.println("Задание №3");


        String fullNameRight = fullName.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullNameRight);


    }
}