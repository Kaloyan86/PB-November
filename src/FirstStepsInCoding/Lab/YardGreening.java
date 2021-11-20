package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        // Изчисления
        // Цената без отстъпката(цена на кв.м 7,61)
        double priceWithoutDiscount = area * 7.61;
        // Изчисляваме отстъпката
        double discount = priceWithoutDiscount * 18 / 100;
        // Приспадаме отстъпката
        double finalPrice = priceWithoutDiscount - discount;
        // Принтиране на резултата
        System.out.printf("The final price is: %f lv.%n" +
                "The discount is: %f lv.", finalPrice, discount);
    }
}
