package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        // Принтиране на резултата
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city);
    }
}
