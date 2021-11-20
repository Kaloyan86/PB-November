package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        String name = scanner.nextLine();
        // Принтиране на резултата
        // отпечатва "Hello, <name>!",
        System.out.println("Hello, " + name + "!");
    }
}
