package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входни данни
        double inches = Double.parseDouble(scanner.nextLine());

        // Пресмятания (Конвертиране от инчове в сантиметри)
        // 1 инч = 2.54 сантиметра
        double centimeters = inches * 2.54;

        // Принтиране на резултата (сантиметри)
        System.out.println(centimeters);
    }
}
